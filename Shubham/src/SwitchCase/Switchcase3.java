package SwitchCase;

public class Switchcase3 {

	public static void main(String[] args) {
		char ch = 'c';
		switch (ch) {
		
		case 'e':
			System.out.println("Value: vowel "+ch);
			break;
		case 'a':
			System.out.println("Value: vowel "+ch);
			break;
		case 'w':
			System.out.println("Value: not a vowel "+ch);
			break;
		case 'o':
			System.out.println("Value: vowel "+ch);
			break;
		default:
			System.out.println("No Value matched");
			break;
		}

	}

}
