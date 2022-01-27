package PracticePrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153, number, rem, rev = 0;
		number = num;
		while (number != 0) {
			rem = number % 10;
			rev = rev + rem * rem * rem;
			number = number / 10;
		}
		
		if (rev == num) {
			System.out.println(num + " is an armstrong number");
		} else {
			System.out.println(num + " is not an armstromg number");
		}
	}

}
