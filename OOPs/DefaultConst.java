class Animal{
Animal(){
System.out.println("This is parent class");
}

}
class Dog extends Animal{
Dog(){
System.out.println("This is Child class");
}
}
class DefaultConst{
	public static void main(String args []){
		Dog g = new Dog();
	}
}