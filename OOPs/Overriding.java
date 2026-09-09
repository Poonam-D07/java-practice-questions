class Overriding{

 void add(int a, int b){
 System.out.println(a+b);
 }
 void add(double a, double b, double c){
 System.out.println(a+b+c);
 }
 public static void main(String [] args){
 Overriding o = new Overriding();
 o.add(10,20);
 o.add(10.5,20.5, 30.5);
}
}