package PracticePrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int rem, rev = 0, temp;    //temp = original integer
		int n = 1234;               //rev  = reversed integer
		
		temp = n;
		
		while( n != 0) {
			
			rem = n % 10;
			rev = rev * 10 + rem;
			n   = n/10;
		}
		System.out.println("r: "+rev );
		System.out.println("o: "+temp);
			if(temp == rev) {
				System.out.println(temp+" is a palindrome");
			}else {
				System.out.println(temp+" is not a palindrome");
			}
	}

}
