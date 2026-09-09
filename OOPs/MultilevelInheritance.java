//  Single Inheritance

class Vehical{
int speed = 60;
void fuelType(){
System.out.println("This vehicle uses petrol or diesel");
}
}
class Car extends Vehical{
String brand = "Toyota";
void disp(){
System.out.println("car brand : " + brand);
System.out.println("car speed : " + speed);
fuelType();
}
public static void main(String [] args){
Car c = new Car();
c.disp();
}
}
