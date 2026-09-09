
public class RunnableWithLembda {

    public static void main(String[] args) {
        // Runnable using Lambda Expression
        Runnable task1 = () -> {

            Thread current = Thread.currentThread();

            for (int i = 1; i <= 5; i++) {

                System.out.println(current.getName() + " | Count: " + i);
                // yield() -> scheduler ko hint deta hai
                if (i == 2) {
                    Thread.yield();
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                    System.out.println(
                            current.getName() +
                                    " was interrupted");

                    current.interrupt();
                    return;
                }

            }
        };

        Runnable task2 = () -> {

            Thread current = Thread.currentThread();

            for (int i = 1; i <= 5; i++) {

                System.out.println(current.getName() + " | Count: " + i);

                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {

                    current.interrupt();
                    return;
                }
            }
        };

        // Creating Thread objects
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Giving names
        t1.setName("Worker-1");
        t2.setName("Worker-2");

        // Check before starting
        System.out.println("Before start: " + t1.isAlive());

        System.out.println("Before start: " + t2.isAlive());
        // Starting threads
        t1.start();
        t2.start();

        // Check after starting
        System.out.println("After start: " + t1.isAlive());

        System.out.println("After start: " + t2.isAlive());

        // Main thread waits for Worker threads
        try {

            t1.join();
            t2.join();

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
        }

        // Both threads completed
        System.out.println("After completion: " + t1.isAlive());

        System.out.println("After completion: " + t2.isAlive());

    }
}