class Student{
int sid;
String sname;
int age;

Student(Student st){
this.sid = st.sid;
this.sname = st.sname;
this.age = st.age;
}
Student(int sid, String sname, int age){
this.sid = sid;
this.sname = sname;
this.age = age;
}

void show(){

System.out.println(sid);
System.out.println(sname);
System.out.println(age);
}
public static void main(String [] args){

Student s = new Student(1, "shreejii", 23);
s.show();
Student t = new Student(2, "shyama ju", 45);
t.show();
Student o = new Student(3, "shreeju", 56);
}



}