class ThisKey{

int x = 10;
void show(int x){
System.out.println("without using this keyword : "  + x);  //output : 90
System.out.println("usnig this keyword : "+ this.x);

System.out.println(this);
}

public static void main(String args[]){
ThisKey k = new ThisKey();
k.show(90);
System.out.println(k);
ThisKey t = new ThisKey();
t.show(30);
System.out.println(t);

}
}