class CurrentObj{

void show(){
disp(this);
}
void disp(CurrentObj obj){
System.out.println("Object passed : " + obj);
}

public static void main(String [] ar){

CurrentObj o = new CurrentObj();
o.show();
}
}