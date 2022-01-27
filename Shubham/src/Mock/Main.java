package Mock;
class Test{

	int i;
}

class Main{
	public static void main(String args []) {
		Test t = new Test();
		System.out.println(t.i);
	}
}
class classA2{
	static {
		System.out.println("static bock is invoked");
	}
	public static void main(String args []) {
		System.out.println("hello main");
	}
}
class $200{
	public static void main(String args[]) {
		System.out.println(10*20+"java");
	}
}