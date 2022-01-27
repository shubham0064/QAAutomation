package StringInterview;

public class Palindrome {

	public static void checkPalin(String s) {

		String str = s;
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed string: " + rev);

		if (str.equals(rev)) {
			System.out.println("String is palin");
		} else {
			System.out.println("String is not palin");
		}

	}

	public static void main(String[] args) {

		checkPalin("nayan0");

	}

}
