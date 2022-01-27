package Interview;

 class superclass {

	public void m1() throws Throwable {
		System.out.println("Parent");
	}
}

class subclass extends superclass {
	public void m1() throws Throwable{
		super.m1();
		System.out.println("child");
	}
}

public class child extends subclass {
	public static void main(String args[]) throws Throwable {

		child c = new child();
		c.m1();
	}
}