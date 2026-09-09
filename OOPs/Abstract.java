
abstract class Vechical {
    abstract void start();
}

class Car extends Vechical {
    void start() {
        System.out.println("car starts");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Vechical v = new Car();
        v.start();
    }
}
