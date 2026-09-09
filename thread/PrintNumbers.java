public class PrintNumbers {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };

        Thread thread = new Thread(task, "Number - Thread");
        thread.start();
    }
}
