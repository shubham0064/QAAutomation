package PracticePrograms;

public class PrimeNumberWhileLoop {

	public static void main(String[] args) {
		
		int num = 33, i = 2;
		boolean res = false;
		
		while(i <= num / 2) {
			
			if(num % i == 0) {
				res = true;
			}
			i++;
		}
			
			if(!res) {
				System.out.println(num+" is a prime number");
			}else {
				System.out.println(num+" is not a prime number");
			}
	}

}
