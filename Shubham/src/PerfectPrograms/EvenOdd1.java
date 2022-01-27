package PerfectPrograms;

public class EvenOdd1 {

	public static void checkEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

	public static void main(String[] args) {
		
		EvenOdd1.checkEvenOdd(11);
		EvenOdd1.checkEvenOdd(20);
		
	}

}
