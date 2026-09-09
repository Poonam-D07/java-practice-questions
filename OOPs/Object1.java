class Parent1 {
    String name;

    void bark() {
        System.out.println("Barking.....");
    }
}

public class Object1 {
    public static void main(String[] args) {
        Parent1 obj = new Parent1();
        obj.name = "Shree";
        obj.bark();
    }
}
