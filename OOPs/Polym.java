class MathodOld {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Polym {
    public static void main(String[] args) {
        MathodOld p = new MathodOld();

        System.out.println(p.add(32, 23));
        System.out.println(p.add(32, 23, 10));
    }
}