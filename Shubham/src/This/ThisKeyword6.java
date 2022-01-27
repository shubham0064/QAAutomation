package This;



class ThisKeyword6 {

	int variable = 5;
	public static void main(String[] args) {
		ThisKeyword6 obj = new ThisKeyword6();
		obj.method(20);
		obj.method();
	}
	void method(int variable) {
		variable = 10;
		System.out.println(this.variable);
		System.out.println(variable);
	}
	void method() {
		int variable = 40;
		System.out.println(this.variable);
		System.out.println(variable);
	}
}
