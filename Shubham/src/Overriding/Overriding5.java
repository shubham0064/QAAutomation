package Overriding;
//Base Class or parent class or Super class
class Parent{
	void show() {
		System.out.println("parents show");
	}
}
//Inherited class or child class or sub class

class child extends Parent{
	// This method overrides show() of Parent
	void show() {
		System.out.println("childs show");
	}
}
//Driver class
class Overriding5 {
	public static void main(String args []) {
		// If a Parent type reference refers to a Parent object, then Parent's show is called
		Parent p = new Parent();
		p.show();
		// If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent p1 = new child();
		p1.show();
	}
}
