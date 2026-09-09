public class PrintTable {
    public static void main(String[] args) {
        Runnable table = () -> {
            int number = 5;
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        };
        Thread thread = new Thread(table, "Table - Thread");
        thread.start();

    }
}
