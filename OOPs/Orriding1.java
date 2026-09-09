//Chang order of parameter in overloading
class Orriding1 {

	void add(int a, String b) {
		System.out.println(a + b);
	}

	void add(double a, String b) {
		System.out.println(a + b);
	}

	void add(String a, int b) {
		System.out.println(a + b);
	}

	void add(String a, double b) {
		System.out.println(a + b);
	}

	public static void main(String arg[]) {
		Orriding1 g = new Orriding1();
		g.add(12, "Poonam");
		g.add(20.5, "Siya");
		g.add("Shree", 30);
		g.add("radhey", 50.50);

	}
}