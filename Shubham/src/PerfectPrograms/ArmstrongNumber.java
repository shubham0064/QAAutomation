package PerfectPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153, rem, rev = 0, temp;
		temp = num;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev + rem * rem * rem;
			temp = temp / 10;
		}
		System.out.println(rev);

		if (rev == num) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}
