class OverloadingBank{

static void deposit(int amount){
System.out.println("Deposit cash : "+amount);
}
 void deposit(int amount, String method){
System.out.println("Deposit  : "+amount+ " via " + method);

}

public static void main(String [] args){
OverloadingBank b = new OverloadingBank();
b.deposit(5000);
b.deposit(5000, "siya");
deposit(234);

}}
