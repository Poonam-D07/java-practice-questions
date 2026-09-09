public class YieldMethod {
    public static void main(String[] args) {

        System.out.println("Thread start...");
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        thread1.setName("thread 1:");
        thread1.setName("thread 2:");
        thread1.setName("thread 3:");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
