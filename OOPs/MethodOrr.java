class Base {
    void show() {
        System.out.println("Parent show call.....");
    }
}

class Child extends Base {
    void show() {
        System.out.println("child show call.....");
    }

    public static void main(String args[]) {
        Child c = new Child();
        c.show();
    }

}