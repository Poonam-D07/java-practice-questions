class Address{

String city, state;
Address(String city, String state){
this.city = city;
this.state = state;
}
}

class Student{
int id;
String name;
Address address;//Aggregation
void student(int id, String name, Address address){
this.id = id;
this.name = name;
this.address = address;
}
void disp(){
System.out.println(id + " " + name);
System.out.println(address.city + " " + address.state);
}
}


class Test{
public static void main(String [] args){

Address addr = new Address("Durg", "C.G.");
Student st = new Student(1, "Poonam", addr);
st.disp();
}
}