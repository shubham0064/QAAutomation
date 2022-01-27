package PracticePrograms;

public class EvenOdd {

	public static void main(String[] args) {
		
		CheckEvenOddNumber(35);
		CheckEvenOddNumber(40);

	}
	
	static void CheckEvenOddNumber(int num) {
		
		if(num%2==0) {
		System.out.println("Given number is even number");
	}else {
		System.out.println("Given number is odd number");
	}
}

}
