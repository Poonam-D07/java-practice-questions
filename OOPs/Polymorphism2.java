
class Calculator {

    void show(int a) {
        System.out.println("Int");
    }

    void show(double a) {
        System.out.println("double");
    }
}

class Polymorphism2 {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.show(34);
        c.show(40.0);
        c.show('A');
    }
}