package PerfectPrograms;

public class ReverseString {

	public static void reverse(String s) {

		String str = s;
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

	}

	public static void main(String[] args) {
		
		reverse("Shrirampur");
	}

}
