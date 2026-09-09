public class SleepMethod {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);

                try {
                    // Current thread 1 second ke liye pause.
                    Thread.sleep(4000);
                } catch (InterruptedException e) {

                    System.out.println("Thread interrupted");
                }
            }
        };
        Thread t1 = new Thread(task, "Worker");

        t1.start();
    }
}
