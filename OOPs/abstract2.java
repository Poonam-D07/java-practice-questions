abstract class vechicle{

abstract void start();
void fuel(){
System.out.println("vechicle uses fuel_________________");
}
}

class Car extends vechicle{

void start(){
System.out.println("car starts with fuel_____________________");
}
}

class Bike extends vechicle{
void start(){
System.out.println("Bike starts with self-start____________");
}
}

class Main{
public static void main(String agrs []){
Car c = new Car();
c.start();
c.fuel();

Bike b = new Bike();
b.start();
b.fuel();
}
}