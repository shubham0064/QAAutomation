package ArrayInterview;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = scn.nextInt();
		int temp,rem,rev = 0;
		temp = no;
		while(no != 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		if(temp == rev) {
			System.out.println("A palindrome number");
		}else {
			System.out.println("Not a palindrome number");
		}
		
		
	}

}
