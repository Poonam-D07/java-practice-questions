class BankAcc{
String accounHolderName = "Poonam";
int accountNumber = 100009;
double balance = 10000;

public void deposit(double amount){
balance = balance+amount;
System.out.println(balance + " deposited successfully");
//System.out.println(amount + " deposited successfully");
} 
public void withdraw(double amount){
if(amount<=balance){
balance = balance-amount;
System.out.println(balance + " withdraw successfully");
//System.out.println(amount + " withdraw successfully");
}else{
System.out.println(" Not sufficient");
}
}
public void displayAmountInfo(){
System.out.println("Name: "+accounHolderName);
System.out.println( "Account Number: "+ accountNumber);
System.out.println( "Balance : " + balance);
}

public static void main(String [] arg){
BankAcc c = new BankAcc();
c.deposit(5000);
c.withdraw(8000);
c.displayAmountInfo();
}
}