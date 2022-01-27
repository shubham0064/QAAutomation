package Interview;

class Test {
	int i;
}

public class main {

	public static void main(String[] args) {

		Test test = new Test();
		System.out.println(test.i);

	}

}
class A2{
	static {
		System.out.println("static block is invoked");
	}
	public static void main(String args[]) {
		System.out.println("hello main");
	}
}