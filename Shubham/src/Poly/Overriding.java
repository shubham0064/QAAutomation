
package Poly;

class Vehicle {
	void run() {
		System.out.println("Vehicle is moving");
	}
}

class Car2 extends Vehicle {
	void run() {
		System.out.println("car is running safely");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Car2 obj = new Car2();// creating object
		obj.run();// calling method

	}
}