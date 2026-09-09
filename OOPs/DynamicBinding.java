class Payment{

void pay(){
System.out.println("Processing paymetn....");
}
}

class UPI extends Payment{
void pay(){
System.out.println("paymetn vid upi....");
}
}

class Creditcard extends Payment {
void pay(){
System.out.println("paymetn vid creditcard....");
}
}

class Main{

public static void main(String args []){
	Payment p = new UPI();
	p.pay();
	Payment p1 = new Creditcard ();
	p1.pay();
}
}