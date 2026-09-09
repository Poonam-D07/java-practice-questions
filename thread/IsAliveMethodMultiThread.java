public class IsAliveMethodMultiThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 200; i <= 210; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 100; i <= 110; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("Before start");
        System.out.println("T1: " + t1.isAlive());
        System.out.println("T2: " + t2.isAlive());

        t1.start();
        t2.start();

        System.out.println("After start");

        System.out.println("T1: " + t1.isAlive());
        System.out.println("T2: " + t2.isAlive());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After 2 seconds");

        System.out.println("T1: " + t1.isAlive());
        System.out.println("T2: " + t2.isAlive());

    }
}
