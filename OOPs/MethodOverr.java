
class Animal {
    void sound() {
        System.out.println("Animal sound....");
    }
}

class Dog extends Animal {

    void sound() {
        super.sound();
        System.out.println("Dog sound.....");
    }
}

class MethodOverr {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
