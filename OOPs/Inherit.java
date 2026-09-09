class Vehicle {
    void start() {
        System.out.println("Starting car.....");
    }

    void stop() {
        System.out.println("stoping car....");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Honking .....");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.start();
        c.honk();
    }
}