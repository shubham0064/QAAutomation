package oops;

class Company101 {
	void display() {
		System.out.println("Im company class display");
	}
}

class Employee101 extends Company101 {
	void display() {
		System.out.println("Im employee class display");
	}

	void callme() {
		System.out.println("Im Employee class callme ");
	}
}

public class Inheritance9 {
	public static void main(String args[]) {
		Employee101 e = new Employee101();
		e.callme();
		e.display();

		Company101 c = new Company101();
		c.display();

		Company101 d = new Employee101();
		d.display();
	}
}
