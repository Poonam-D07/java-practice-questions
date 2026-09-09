class DifferentPara{
int add(int a, int b){ return a+b;}

int add(int a, int b, int c){return a+b+c;}

double add(double a, double b, double c){return a+b+c;}

public static void main(String args[]){
	DifferentPara p = new DifferentPara();
	System.out.println("a+b = " + p.add(1,2) + " \n a+b+c = "+ p.add(1,2,3)+ "\n a+b+c = "+ p.add(3,3,3));
}
}