package This;

class A {

	void m() {
		System.out.println("Im m method");
	}
	
	void n() {
		this.m();
		System.out.println("Im n method");
	}
}	
class ThisKeyword3{
	 
	void methodone() {
		System.out.println("Inside methodone");
	}
	void methodtwo() {
		this.methodone();
		System.out.println("Inside methodtwo");
	}
	
	public static void main(String[] args) {
		ThisKeyword3 obj = new ThisKeyword3();
		obj.methodtwo();
		A a = new A();
		a.n();
	}
}

