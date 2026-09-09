class Product1{
int productId = 1001;
String name = "destop";
double price = 47000;
double discountAmount;

public void applyDiscount(double discountParcentage){
 System.out.println("Original Price   : " + price);
 discountAmount = (discountParcentage/100)*price;
 System.out.println(" Percentage of "+discountParcentage+  "% : " + discountAmount);
}

public void displayFinalPrice(){
price = price-discountAmount;
   System.out.println("Final Price  : " + price);

}
public void productInfo(){
  System.out.println("Product id  : " + productId);
   System.out.println("Product name  : " + name); 


}

public static void main(String [] arg){
Product1 p = new Product1();
p.productInfo();
p.applyDiscount(12);
p.displayFinalPrice();
System.out.println(p);

   System.out.println("__________________________________________ ");

Product1 t = new Product1();
t.productInfo();
t.applyDiscount(20);
t.displayFinalPrice();
  System.out.println(t);



}
}