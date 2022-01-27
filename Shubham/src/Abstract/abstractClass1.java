package Abstract;

abstract class bike1 {
	abstract void run();

	void speed(int sped) {
		System.out.println("speed");
	}
}

class Honda extends bike1 {
	void run() {
		System.out.println("runs safe");
	}

	void speed(int sped) {
		System.out.println("speed is " + sped);
	}

	void color() {
		System.out.println("color is blue");
	}
}

public class abstractClass1 {
	public static void main(String args[]) {
		Honda h = new Honda();
		h.run();
		h.speed(120);
		h.color();
		System.out.println("__________");

		bike1 b = new Honda();
		b.run();
		b.speed(150);
	}
}
//we cant instantiatate bike1 b = new bike1();
//because of class of bike is abstract