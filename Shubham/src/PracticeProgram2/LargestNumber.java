package PracticeProgram2;

class Array2 {

	static void large(int arr[]) {
		int large = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (large < arr[i]) {
				large = arr[i];
			}
		}
		System.out.println("Largest number in array is: " + large);
	}
}
public class LargestNumber {
	public static void main(String args[]) {
		int a[] = { 6, 8, -28, 5, 1, 28 };
		Array2.large(a);
	}
}
