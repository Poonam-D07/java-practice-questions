class Constructor{
Constructor(){
this(10);//calling another constructor
System.out.println("Default constructor");
}
Constructor(int x){
this(10,20);
System.out.println(x);
}
Constructor(int x, int y){

System.out.println(x+y);
}
public static void main(String [] arg){

Constructor c = new Constructor();

}
}