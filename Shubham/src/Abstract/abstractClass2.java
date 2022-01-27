package Abstract;

abstract class shape {
	abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends shape {
	void draw() {
		System.out.println("rectangle shape");
	}
}

class circle extends shape {
	void draw() {
		System.out.println("circle shape");
	}
}
//In real scenario, method is called by programmer or user
class abstractClass2 {
	public static void main(String args[]) {
		// shape s = new shape();

		shape s1 = new Rectangle();
		s1.draw();

		shape s2 = new circle();
		s2.draw();
	}
}
