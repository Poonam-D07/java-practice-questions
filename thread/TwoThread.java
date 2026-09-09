public class TwoThread {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-1 : " + i);
            }
        };
        Runnable task2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-2 : " + i);
            }
        };
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }

}

// Why order change hota hai?
// JVM/OS scheduler decide karta hai kis thread ko CPU kab milega.
