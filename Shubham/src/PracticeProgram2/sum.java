package PracticeProgram2;

public class sum {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 2, 1, -2, 3 ,10};
		double sum = 0;

		for (int num : numbers) {
			sum = sum + num;
		}
		System.out.println("Sum = " + sum);
		
//		for(int i = 0;i<numbers.length;i++) {
//			sum = sum + numbers[i];
//		}
//		System.out.println(sum);

	}
}
