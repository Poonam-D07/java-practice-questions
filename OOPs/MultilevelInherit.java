//Multilevel Inheritance

class Bank {
String bankName = "SBI";
void bankDetails(){
System.out.println("Bank Name : "+bankName);
}
}

class Account extends Bank{
int accountNum = 123456;
void accountDetails(){
System.out.println("Account Number  : "+accountNum);
}
}

class SavingAccount extends Account{
double interestRate = 5.5;
void showDetails(){
bankDetails();
accountDetails();
System.out.println("Interest Rate : "+interestRate+ "%");

} 
}

class MultilevelInherit{
public static void main(String args [] ){
SavingAccount t = new SavingAccount();
//t.bankDetails();
//t.accountDetails();
t.showDetails();
}
}

