class Animal{
void eat(){
System.out.println("eating...");
}

}

class Dog extends Animal{
void bark(){
System.out.println("barking...");
}
public static void main(String [] agr){
Dog g = new Dog();
g.bark();
g.eat();

}

}