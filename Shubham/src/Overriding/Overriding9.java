package Overriding;

class Parent5 {
	void show() {
		System.out.println("parents show");
	}
}

class child5 extends Parent5 {
	// This method overrides show() of Parent
	void show() {
		super.show();
		System.out.println("childs show");
	}
}

class grandchild extends child5 {
	// This method overrides show() of Parent
	void show() {
		super.show();
		System.out.println("grandchilds show");
	}
}

public class Overriding9 {
	public static void main(String args[]) {
		grandchild g = new grandchild();
		g.show();
	}
}
