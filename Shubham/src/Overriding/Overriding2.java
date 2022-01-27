package Overriding;

class Animal2 {
	public void move() {
		System.out.println("Animal can move");
	}
}

class Dog2 extends Animal2 {
	public void move() {
		super.move();// invokes the super class method
		System.out.println("Dog can walk and run");
	}
}

public class Overriding2 {
	public static void main(String args[]) {

		Animal2 a = new Dog2();// Animal reference but Dog object
		a.move();// runs the method in Dog class
	}
}
