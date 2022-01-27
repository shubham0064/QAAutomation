package This;

public class FinalKeyword3 {
	final int cube(int n) {
		n = n+1;
		System.out.println(n);
		return n;
		
	}

	public static void main(String[] args) {
		FinalKeyword3 b = new FinalKeyword3();
		b.cube(5);
	}

}
