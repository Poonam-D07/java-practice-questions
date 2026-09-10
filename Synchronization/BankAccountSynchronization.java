
class BankAccount {
    int balance = 1000;

    synchronized void withdraw(int amount) {

        System.out.println(
                Thread.currentThread().getName()
                        + " entered withdraw()");

        System.out.println(
                Thread.currentThread().getName()
                        + " checked balance = " + balance);

        // Thread pehle check karta hai ki balance enough hai ya nahi.
        if (balance >= amount) {

            // Imagine karo yahan thoda time lag gaya.
            // Isi time doosra thread bhi balance check kar sakta hai.
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance = balance - amount;

            System.out.println(Thread.currentThread().getName() + " withdrew " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " -> Insufficient balance !");
        }
    }
}

public class BankAccountSynchronization {

    public static void main(String[] args) {

        // ONE bank account object.
        // Both threads will use the SAME account.
        BankAccount account = new BankAccount();

        // Thread-1 wants to withdraw ₹650.
        Thread t1 = new Thread(() -> {
            account.withdraw(650);

        }, "Thread-1");

        // Thread-2 also wants to withdraw ₹650.
        Thread t2 = new Thread(() -> {
            account.withdraw(650);
        }, "Thread-2");

        t1.start();
        t2.start();

        try {
            // Main thread waits for both threads to finish.
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Final balance = " + account.balance);
    }
}
