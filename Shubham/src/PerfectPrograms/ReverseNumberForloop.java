package PerfectPrograms;

public class ReverseNumberForloop {

	public static void main(String[] args) {

		int num = 54321, rem, rev = 0;
		for (; num > 0;) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
		
//		while(num != 0) {
//			rem = num % 10;
//			rev = rev * 10 + rem;
//			num = num / 10;
//		}
//		System.out.println(rev);
		
		
		
		
		
		
		
	}

}
