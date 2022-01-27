package PerfectPrograms;

public class PalindromeString {

	public static void checkpalin(String s) {
		String str = s;
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("Palin");
		} else {
			System.out.println("Not Palin");
		}
	}

	public static void main(String[] args) {
		checkpalin("nayan");
	}

}
