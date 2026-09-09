class Base{

void disp(){
System.out.println("Base class display");
}
}

class Child extends Base {

void disp(){
System.out.println("child class display");
}

void show(){
System.out.println("child class show");
}
}

class Main {
public static void main(String [] args){

Base b = new Child();
b.disp();
Child c = (Child)b;
c.show();

}
}