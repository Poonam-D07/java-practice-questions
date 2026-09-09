class Calculator{
	int add(int a, int b){
	return a+b;
	}
	int add(int a, int b, int c){
		return a+b+c;
	}
}
class DiffParameter{
	public static void main(String args[]){
		Calculator c = new Calculator();
		System.out.println("a+b = "+c.add(10,20) + " \n" +"a+b+c = "+c.add(10,20,30));
	}
}