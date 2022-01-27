package oops;

class Animal7 {
	void eat() {
		System.out.println("eat method of animal7");
	}
}

class Dog7 extends Animal7 {
	void eat() {
		System.out.println("eat method of dog7");
	}

	void bark() {
		System.out.println("bark method of dog7");
	}

	void work() {

		bark();
		eat();
		super.eat();
		System.out.println("work method of dog7");
	}
}

class SuperKeyWord2 {
	public static void main(String args[]) {
		Dog7 d = new Dog7();
		d.work();
	}
}
