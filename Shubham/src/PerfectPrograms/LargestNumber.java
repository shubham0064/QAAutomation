package PerfectPrograms;

public class LargestNumber {

	public static void largest(int num1, int num2, int num3) {
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("largest no: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("largest no: " + num2);
		} else {
			System.out.println("largest no: " + num3);
		}
	}

	public static void main(String[] args) {

		LargestNumber.largest(10, 20, 30);
		LargestNumber.largest(55, 85, 12);
	}

}

