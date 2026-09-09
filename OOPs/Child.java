class Payment{
void pay(){
System.out.println("Processing payment.....");
}
}
class Upi extends Payment{
void pay(){
System.out.println("Upi payment....");

}

public static void main(String args []){
Upi c = new Upi();
c.pay();
}

}