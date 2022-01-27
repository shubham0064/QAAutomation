package Overriding;
class abc{
	public void mymethod() {
		System.out.println("my method of abc");
	}
}
class Overriding4 extends abc {
	public void mymethod() {
		// This will call the myMethod() of parent class
		super.mymethod();
		System.out.println("my method of overriding class");
		
	}
	public static void main(String args []) {
		Overriding4 obj = new Overriding4();
		obj.mymethod();
	}
}
