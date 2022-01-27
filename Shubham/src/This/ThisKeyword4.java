package This;

class ThisKeyword4 {
	void m() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		ThisKeyword4 obj = new ThisKeyword4();
		
		System.out.println(obj);
		obj.m();
	}

}
