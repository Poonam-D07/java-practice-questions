//Think about this program like case study. Goes below| drawback


class Emp{
int eid;                 
String ename;
static String cname = "tcs";   
void setEmp(int ei, String en){
 eid = ei;
ename = en;

}
void getEmp(){
System.out.println(eid);
System.out.println(ename);
//System.out.println(e1.cname);// unable with object(error)
System.out.println(Emp.cname); //able with class name

}
public static void main(String[] args){

  Emp e1 = new Emp();
e1.setEmp( 1, "Ram");
e1.getEmp();

System.out.println("__________________________________________________________");

 Emp e2 = new Emp();
 e2.setEmp( 2, "Sita");
 e2.getEmp();

}
}

