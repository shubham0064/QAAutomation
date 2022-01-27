package PracticePrograms;

public class PositiveNumber {

	public static void main(String[] args) {
		
		int num = 60;
		
		System.out.println("Factors of positive number "+num+" are: ");

		for(int i = 1; i <= num; i++) {
			if(num % 1 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
