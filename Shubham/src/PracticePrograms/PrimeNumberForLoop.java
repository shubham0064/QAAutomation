package PracticePrograms;

public class PrimeNumberForLoop {

	public static void main(String[] args) {

		
		int num = 11;
		int count = 0;
		for(int i = 2; i < num; i++) {
			 if(num%2 == 0) {
				 count = 1;
			 }
		}
		if(count == 0) {
			System.out.println("prime");
		}else {
			System.out.println("Not prime");
		}
	}
}