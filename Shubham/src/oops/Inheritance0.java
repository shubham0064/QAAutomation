package oops;

class A {
	static int a = 10;
	int b = 20;
	double c = 22.55;
}
class B {
	static int x = 30;
	int y = 40;
	double z = 45.55;
}
class C {
	static int p = 50;
	int q = 60;
	double r = 65.55;
}

public class Inheritance0 {

	public static void main(String args[]) {
		System.out.println(A.a);
		System.out.println(B.x);
		System.out.println(C.p);
		System.out.println("_____________");
		
		A a1 = new A();
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println("____________");
		
		B b1 = new B();
		System.out.println(b1.y);
		System.out.println(b1.z);
		System.out.println("____________");
		
		C c1 = new C();
		System.out.println(c1.q);
		System.out.println(c1.r);

	}
}
