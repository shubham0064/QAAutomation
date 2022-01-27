package PracticePrograms;

public class NumberOfDigitsWhileLoop {

	public static void main(String[] args) {
		
		int count = 0, num = 426426;
		
		while(num != 0) {
			num = num/10;
			count++;
		}
			System.out.println("Number of Digits: "+count);
	}

}
