package oops;

//parent class
class vehicle {
	public void wheels() {
		System.out.println("Ive wheels");
	}
}
//first child class of vehicle class
class bike extends vehicle {
	public void count1() {
		System.out.println("Im bike Ive 2 wheels");
	}
}
//second child class of vehicle class
class car2 extends vehicle {
	public void count2() {
		System.out.println("Im car Ive 4 wheels");
	}
}
//third child class of vehicle class
class scooter extends vehicle {
	public void count3() {
		System.out.println("Im scooter Ive 2 wheels");
	}
}
//fourth child class of vehicle class
class truck extends vehicle {
	public void count4() {
		System.out.println("Im truck Ive 10 wheels");
	}
}

public class Inheritance4 {
	public static void main(String args[]) {
		truck t1 = new truck();// object of truck class
		t1.wheels();
		t1.count4();
		scooter s1 = new scooter();// object of scooter class
		s1.wheels();
		s1.count3();
		car2 c1 = new car2();// object of car class
		c1.wheels();
		c1.count2();
		bike b1 = new bike();// object of bike class
		b1.wheels();
		b1.count1();
	}
}
