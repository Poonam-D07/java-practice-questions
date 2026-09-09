class Calculation {

    int sub(int a, int b) {

        return a - b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double mul(double a, double b) {
        return a * b;
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        System.out.println("Subtraction : " + c.sub(45, 34));
        System.out.println("Addition : " + c.add(44, 33, 55));
        System.out.println("multiply: " + c.mul(4, 5));
    }
}
