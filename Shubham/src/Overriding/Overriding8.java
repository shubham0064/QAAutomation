package Overriding;

class Parent4 {
	// Static method in base class which will be hidden in subclass
	static void m1() {
		System.out.println("from parent static method");
	}

	// Non-static method which will be overridden in derived class
	void n() {
		System.out.println("from parent non static method/instance");
	}
}

class Child4 extends Parent4 {
	// This method hides m1() in Parent
	static void m1() {
		System.out.println("from child static method");
	}

	// This method overrides m2() in Parent
	public void n() {
		System.out.println("from child  non static method/instance");
	}
}

//Driver class
public class Overriding8 {
	public static void main(String args[]) {
		Parent4 p = new Child4();
		// As per overriding rules this should call to class Child static overridden
		// method.
		// Since static method can not be overridden, it calls Parent's m1()
		p.m1();
		// Here overriding works and Child's m2() is called
		p.n();
	}
}
