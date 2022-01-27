package Final;

class FinalKeyword3 {
	int cube(final int n) {
		System.out.println(n);
	//	n = n + 1;
		return n*n*n;
		
	}
	public static void main(String args[]) {
		FinalKeyword3 f1 = new FinalKeyword3();
		f1.cube(5);
	}
}
// here value of n cannot be reinitialized or compiler throw error