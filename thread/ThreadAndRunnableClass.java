public class ThreadAndRunnableClass {
    public static void main(String[] args) {
        // 1. Creating Thread by extending Thread class
        class MyThread extends Thread {

            @Override
            public void run() {
                // super.run();
                for (int i = 1; i <= 4; i++) {
                    System.out.println("Thread " + Thread.currentThread().getName() + " | " + i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        MyThread t1 = new MyThread();
        // Before start thread
        System.out.println("t1 alive : " + t1.isAlive());
        t1.setName("Thread-1 ");

        // start() -> new thread create karke run() execute karta hai
        t1.start();
        System.out.println("t1 alive : " + t1.isAlive());

        // 2. Creating Thread using Runnable
        Runnable task = new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Runnable " + Thread.currentThread().getName() + " : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }

        };

        Thread t2 = new Thread(task);
        t2.setName("Thread-2");

        System.out.println("t2 alive " + t2.isAlive());
        t2.start();

        System.out.println("t2 alive : " + t2.isAlive());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

            System.out.println("t1 alive after completion: "
                    + t1.isAlive());

            System.out.println("t2 alive after completion: "
                    + t2.isAlive());
        }
    }
}
