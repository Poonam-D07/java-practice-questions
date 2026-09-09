class ReturnCurrentObj{

ReturnCurrentObj getObj(){
return this;
}

public static void main(String [] a){

ReturnCurrentObj j = new ReturnCurrentObj();
ReturnCurrentObj o = j.getObj();
System.out.println(o);
}
}