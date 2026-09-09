//Think about this program like case study. Goes below|


class Employee{
int e_id;                //# make variable private bcoz no access outside class
String e_name, c_name;  //#class ke bahar koi bi directly access kar sakta#
void setEmployee(int eid, String ename, String cname){
 e_id = eid;
e_name = ename;
c_name = cname;
}
void getEmployee(){
System.out.println(e_id);
System.out.println(e_name);
System.out.println(c_name);
}
public static void main(String[] args){

 Employee e3 = new Employee();
e3.setEmployee( 0, " ", "");
e3.getEmployee();

System.out.println("_________________________________________________________");

 Employee e1 = new Employee();
e1.setEmployee( 1, "Ram", "tcs");
e1.getEmployee();

System.out.println("__________________________________________________________");

 Employee e2 = new Employee();
 e2.setEmployee( 2, "Sita", "tcs");
 e2.getEmployee();

}
}

/*Think about this program like case study. Goes below|
#1. No data safe, use Encapsulation for data safety.
#2. Encapsulation: purpose of encapsulation is hiding data , access through methods(get, set).
#3. access or update value directly outside class of same class package
#4. make private variable, bcoz class ke bahar directly access nahi hota
#5.  Without Encapsulation  Direct access ,(open lock, no lock)
 With Encapsulation  Method ke through access(lock with key)


ai ane se it khatare me h? 
why we use ai in your life? LLM.
why need ai to, manullay jo kaam karte the wo ai automatically kar deta h
*/