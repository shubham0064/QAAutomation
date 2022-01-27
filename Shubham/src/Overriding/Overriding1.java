package Overriding;

class Animal1{
	void move() {
		System.out.println("Animals can move");
	}
}
class Dog extends Animal1{
	public void move() {
		System.out.println("Dog can move and run");
	}
	public void bark() {
		System.out.println("Dog can bark");
	}
}
public class Overriding1 {
	public static void main(String args[]) {
		Animal1 a = new Animal1();
		a.move();
		
		Dog d = new Dog();// Animal reference but Dog objec
		d.move();
		d.bark();
		
		System.out.println("____________");
		
		Animal1 a1 = new Dog();// you will get dog class move(), bark()
		a1.move();

		//a1.bark(); // a1 compile time error since b's reference type Animal doesn't
	}
}
