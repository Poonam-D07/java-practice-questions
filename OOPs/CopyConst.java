class Employee5{
String name;
int salary;
Employee5(){
this("default", 10000);//calling another constructor
}
Employee5(String n, int s){
name = n;
salary = s;
}
public static void main(String [] arg){
Employee5 e = new Employee5();
System.out.println("Name : " +e.name + " \nsalary : " + e.salary);
}
}