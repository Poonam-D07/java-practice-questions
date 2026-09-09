public class JoinMethod {
    public static void main(String[] args) {
        System.out.println("Thread start here...");
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 10; i > 1; i--) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }

        );
        thread1.setName("thread 1:");
        thread2.setName("thread 2:");

        thread1.start();
        thread2.start();

        try {
            // Main thread yahan wait karega
            // jab tak thread1 & thread2 complete nahi hota.
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread completed. ");
    }
}
