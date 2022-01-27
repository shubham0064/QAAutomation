package Abstract;

//Abstract class
abstract class Animal {
	// Abstract method (does not have a body)
	public abstract void animalsound();

	// Regular method
	public void sleep() {
		System.out.println("Zzzz");
	}
}

//Subclass (inherit from Animal)
class pig extends Animal {
	public void animalsound() {
		// The body of animalSound() is provided here
		System.out.println("pig says wee wee");
	}
}

//Subclass (inherit from Animal)
class dog6 extends Animal {
	public void animalsound() {
		// The body of animalSound() is provided here
		System.out.println("dog says bow bow");
	}
}

public class abstractclass {
	public static void main(String args[]) {
		pig p = new pig();
		p.animalsound();
		p.sleep();

		dog6 d = new dog6();
		d.animalsound();
		d.sleep();
	}
}
