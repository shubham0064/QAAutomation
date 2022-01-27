package This;

class ThisKeyword5 {
	
	int variable = 5;
	
	public static void main(String[] args) {
		ThisKeyword5 obj = new ThisKeyword5();
		obj.method(20);
		obj.method();
		System.out.println(obj.variable);
	}

	void method(int variable) {
		System.out.println(variable);
	}
	
	void method() {
		variable = 25;
		System.out.println(variable);
	}
}
