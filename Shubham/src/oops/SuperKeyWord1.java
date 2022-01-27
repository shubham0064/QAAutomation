package oops;

class Anima6 {
	String color = "white of red";
}

class Dog6 extends Anima6 {
	String color = "black";

	void printcolor() {
		System.out.println("Dog color is " + color);
		System.out.println("Animal color is " + super.color);
	}
}

class SuperKeyWord1 {
	public static void main(String args[]) {
		Dog6 d = new Dog6();
		d.printcolor();

		String s1 = "12 servers";
		System.out.println(s1.matches(".+[\\s]servers"));
		System.out.println(s1.indexOf("shailesh"));
		String[] str = s1.split("shailesh");
	}
}
