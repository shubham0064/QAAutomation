package PerfectPrograms;

public class PrimeNumberForLoop {

	public static void main(String[] args) {

		int num = 13;
		int count = 0;
		for(int i=2;i<num;i++) {
			if(num%2 == 0) {
				count = 1;
			}
		}
		
		if(count == 0) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not a prime number");
		}
	}

}
