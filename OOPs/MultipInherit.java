
class Animal {
    void eat() {
        System.out.println("eating....");
    }

    void sleep() {
        System.out.println("sleeping...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking.....");
    }
}

class Cat extends Animal {
    void meeau() {
        System.out.println("meeau.....");
    }
}

class Cow extends Animal {
    void moo() {
        System.out.println("moo.....");
    }
}

public class MultipInherit {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.moo();
        c.eat();
        c.sleep();
        Cat t = new Cat();
        t.meeau();
        t.eat();
        t.sleep();
    }
}
