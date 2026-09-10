
class Inventory {

    int stock = 1;

    void purchase() {
        // Check whether product is available.
        if (stock > 0) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // UPDATE: Product is purchased, so reduce stock.
            stock--;

            System.out.println(
                    Thread.currentThread().getName()
                            + " purchased the product.");

        } else {

            System.out.println(
                    Thread.currentThread().getName()
                            + " → Product is out of stock.");
        }
    }
}

public class Stock_RaceCondition {

    public static void main(String[] args) {

        // SAME inventory object is shared by both threads.
        Inventory inventory = new Inventory();

        Thread t1 = new Thread(() -> {

            inventory.purchase();

        }, "Customer-1");

        Thread t2 = new Thread(() -> {

            inventory.purchase();

        }, "Customer-2");

        t1.start();
        t2.start();

        try {

            t1.join();
            t2.join();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println(
                "Remaining Stock = " + inventory.stock);
    }
}