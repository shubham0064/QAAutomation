package oops;

//super class/ parent class
class A1 {
	A1() {
	}

	static int a = 10;
	int b = 20;
	double c = 22.55;
}
//subclass / child class
class B1 extends A1 {
	B1() {
		super();
	}

	static int x = 30;
	int y = 40;
	double z = 45.55;
}
class C1 extends B1 {
	C1() {
		super();
	}

	static int p = 50;
	int q = 60;
	double r = 65.55;
}
public class Inheritance1 {
	public static void main(String args []) {

		/****************** Access static member class A members *********************/
		System.out.println(A1.a);
		/****************** Access static member class B members *********************/
		System.out.println(B1.x);
		/****************** Access static member class c members *********************/
		System.out.println(C1.p);
		
		/****************** Access non-static member class A members *********************/
		/******************Access non-static member class A1,B1 & C1 members*********************/
		C1 c1 = new C1();
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.q);
		System.out.println(c1.r);
		System.out.println(c1.y);
		System.out.println(c1.z);

	}
}
