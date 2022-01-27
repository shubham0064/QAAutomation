package Interface;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

class Interface3 implements Printable, Showable {
	public void print() {
		System.out.println("Print method");
	}

	public void show() {
		System.out.println("Show method");
	}

	public static void main(String args[]) {
		Interface3 i = new Interface3();
		i.print();
		i.show();
	}
}
