package Loops;

public class WhileLoop2 {

	public static void main(String[] args) {
		int i=4;
		System.out.println("Printing numbers from 4 to 0");
		while(i>=0) {
			System.out.println("Hello "+i);
			i--;
		}
		
		char c1 = 'A';
		while(c1 <= 'Z') {
			System.out.print(c1 + " ");
			c1++;
		}
		
		System.out.println("\n________reverse____________");
		
		char c2 = 'Z';
		while(c2>='A') {
			System.out.print(c2 + " ");
			c2--;
		}

	}

}
