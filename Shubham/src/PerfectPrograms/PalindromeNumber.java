package PerfectPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 1221, rem, rev = 0, temp;
		temp = num;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("Number is palin");
		} else {
			System.out.println("Number is not palin");
		}
	}

}
