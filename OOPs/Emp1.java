//Think about this program like case study. Goes below| drawback

//non static to static method 
class Emp1{
int eid;                 
String ename;
static String cname = "tcs";   
void setEmp(int ei, String en){
 eid = ei;
ename = en;

}
static void cchange(String cn){
cname = cn;
}

void getEmp(){
System.out.println(eid);
System.out.println(ename);
//System.out.println(Emp1.cname);

}
public static void main(String[] args){
Emp1.cchange("google");
//cchange("google");
  Emp e1 = new Emp();
e1.setEmp( 1, "Ram");
e1.getEmp();

System.out.println("__________________________________________________________");

 Emp e2 = new Emp();
 e2.setEmp( 2, "Sita");
 e2.getEmp();

}
}

