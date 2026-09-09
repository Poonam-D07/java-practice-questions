class ThisMethod{

void show(){

this.disp();
}
void disp(){
System.out.println("hello");
}
public static void main (String [] args){

ThisMethod t = new ThisMethod();
t.show();
}
}