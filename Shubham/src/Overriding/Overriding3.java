package Overriding;

class Human {
	// Overridden method
	void eat() {
		System.out.println("Human is eating");
	}
}

class boy extends Human {
	// Overriding method
	void eat() {
		super.eat();
		System.out.println("boy is eating");
	}
}

public class Overriding3 {
	public static void main(String args[]) {
		boy b = new boy();

		// This will call the child class version of eat()

		b.eat();

		Human h = new Human();
		h.eat();
	}
}
