package ArrayInterview;

public class ReverseNumber {

	public static void main(String args[]) {

		int no = 354655, rem, temp, rev = 0;
		temp = no;
		while (no != 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println("R: " + rev);
		System.out.println("O: " + temp);

	}

}
