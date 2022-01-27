package PerfectPrograms;

public class Vowel {

	public static void checkVowelConsonent(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Character is vowel");
		} else {
			System.out.println("Character is consonent");
		}

	}

	public static void main(String[] args) {

		Vowel.checkVowelConsonent('e');
	}

}
