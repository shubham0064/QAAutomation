package DerivedCasting;

class A {
	void test1() {
		System.out.println("Running test1");
	}
}

class B extends A {
	void test2() {
		System.out.println("Running test2");
	}
}

class C extends B {
	void test3() {
		System.out.println("Running test3");
	}
}

public class explicitUpCasting {

	public static void main(String[] args) {
		C c = new C();
		B b =(B)c;
		b.test1();
		b.test2();
		
		A a1 =(A)c;
		a1.test1();
		
		B b1 =(B) a1;
		
	}

}
