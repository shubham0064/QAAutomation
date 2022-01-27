package PerfectPrograms;

public class ReverseNumberWhileLoop {

	public static void main(String[] args) {

		int num = 1221;
		int rem,rev=0,temp;
		temp = num;
		
		while(num !=0 ) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
		if(temp == rev) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}

}
