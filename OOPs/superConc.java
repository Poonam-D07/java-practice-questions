class Base{
static void show(){
System.out.println("base class call " );
}
}
class Child extends Base{
//both class method are static so not possible overriding 
static void show(){
System.out.println("Child class call " );
Base.show();
//call parent method with help of class name because method is static so, so super() //is non-static then it do not able to call static method

}

public static void main(String  [] args){
 Child c = new Child();
c.show();
}
}