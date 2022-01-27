package oops;

class Grandfather {
	Grandfather() {
		System.out.println("Im grandfather constr");
	}
	void myhome() {
		System.out.println("Im home of grandf");
	}
}
class Father extends Grandfather {
	Father(double d) {
		super();
		System.out.println("Im father constr");
	}
	void mycar() {
		System.out.println("Im car of father");
	}
}class child1 extends Father {
	child1(int i) {
		super(10.5);
		System.out.println("Im child1 constr");
	}
	void mybike() {
		System.out.println("Im bike of child");
	}
}
public class Inheritance6 {
	public static void main(String args[]) {
		System.out.println("_____________");
		child1 c = new child1(21);

		c.mybike();
		c.mycar();
		c.myhome();
		System.out.println("______________");

		Father f = new child1(10);
		f.myhome();
		f.mycar();
		System.out.println("______________");

		Grandfather g1 = new child1(25);
		g1.myhome();
		System.out.println("_____________");

		Grandfather g2 = new Father(55.5);
		g2.myhome();

	}
}
