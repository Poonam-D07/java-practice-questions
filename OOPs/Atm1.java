class Atm1 {
    double balance = 10000.0;

    public void checkBalance() {
        System.out.println("Current Balance : " + balance);
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Total amount : " + balance);
    }

    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(balance + " withdrawal successfully ");
        } else
            System.out.println("Not sufficient amount ");
    }

    public static void main(String[] args) {
        ATM m = new ATM();
        m.checkBalance();
        m.withdrawal(5000);
        m.deposit(2000);
    }
}
