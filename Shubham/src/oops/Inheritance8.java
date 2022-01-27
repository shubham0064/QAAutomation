package oops;

class fruitA {
	int fruitage;

	fruitA() {
		System.out.println("fruitA constr");
		fruitage = 7;
	}

	public void taste() {
		System.out.println("fruit are sweet");
	}
}

class mango extends fruitA {
	int fruitage;

	mango() {
		// super(); //java compiler will write default super()
		System.out.println("mango constr");
		fruitage = 5;
	}

	public void taste() {
		System.out.println("mango taste is sweet");
	}

	public void shape() {
		System.out.println("Mango shape is oval");
	}
}

public class Inheritance8 {
	public static void main(String args[]) {
		mango m = new mango();
		m.taste();
		m.shape();
		System.out.println(m.fruitage);

		fruitA f = new fruitA();
		f.taste();
		System.out.println(f.fruitage);
	}
}
