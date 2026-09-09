
class AreaCal {
    int area(int a, int b, int c) {
        return a * b * c;
    }

    int area(int l, int b) {
        return 2 * (l + b);
    }

    double area(double r) {
        return (14.7 * r);
    }

}

class PolymOverlod {
    public static void main(String[] args) {
        AreaCal c = new AreaCal();
        System.out.println("Area of square : " + c.area(4, 4, 4));
        System.out.println("Area of rectangle : " + c.area(8, 4));
        System.out.println("Area of circle : " + c.area(5));

    }
}
