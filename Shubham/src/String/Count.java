package String;

public class Count {

	static void getcount(String s1) {

		char[] cArray = s1.toCharArray();
		int letter = 0, space = 0, num = 0, others = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (Character.isLetter(cArray[i])) {
				letter++;
			} else if (Character.isSpace(cArray[i])) {
				space++;
			} else if (Character.isDigit(cArray[i])) {
				num++;
			} else {
				others++;
			}
		}
		System.out.println("Letters: " + letter);
		System.out.println("Spaces: " + space);
		System.out.println("Numbers: " + num);
		System.out.println("Others: " + others);
		

	}

	public static void main(String[] args) {
		getcount("I am from pune, lives in Dhanori 411015. A-1#1003");

	}

}
