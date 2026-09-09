class Student {
    int id = 7;
    String name = "siya";

    public void student(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.id + " " + s.name);
    }
}