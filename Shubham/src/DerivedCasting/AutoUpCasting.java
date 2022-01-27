package DerivedCasting;

class A2{
	void test1() {
		System.out.println("Running test1()");
	}
}
class B2 extends A2{
	void test2() {
		System.out.println("Running test2()");
	}
}
class C2 extends B2{
	void test3() {
		System.out.println("Running test3()");
	}
}
public class AutoUpCasting {
	public static void main(String args[]) {
//		C2 c2 = new C2();
//		c2.test1();
//		c2.test2();
//		c2.test3();
//		
//		B2 b2 = new B2();
//		b2.test1();
//		b2.test2();
//		
//		A2 a2 = new A2();
//		a2.test1();
		
		B2 b1 = new C2();
		b1.test1();
		b1.test2();
		
		C2 c2= new C2();
		B2 b2 = c2;
		b2.test1();
		b2.test2();
	
	}
}
