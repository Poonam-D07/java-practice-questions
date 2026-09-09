class abstract Animal{

abstract void fly();
void nonfly(){
System.out.println("nonfly call");
}
}

class Bird extends Animal{

void fly(){
System.out.println("bird fly call");
}

void show(){
System.out.println("bird show call");
}
public static void main (String [] args){

Bird b = new Bird();
b.show();
b.fly();
b.nonfly();
}
}