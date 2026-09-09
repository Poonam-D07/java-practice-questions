
class Employee {
    String name = "Poonam";
    int salary = 99999;

    void displayInfo() {
        System.out.println("Name  : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Developer extends Employee {
    String codeLang = "JAVA";
    String database = "MySQL";
    int teamSize = 10;

    void display() {
        System.out.println("code Language : " + codeLang);
        System.out.println("Database : " + database);
        System.out.println("Team size : " + teamSize);

    }
}

public class SingleInherit {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.displayInfo();
        d.display();

    }
}
