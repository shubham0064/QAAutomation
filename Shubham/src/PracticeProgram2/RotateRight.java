package PracticeProgram2;

public class RotateRight {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		// n determine no. of times an array should rotate
		int n = 3;
		// Display original array
		System.out.println("Original Array");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		// Rotate given array by n times towards left
		for (int i = 0; i < n; i++) {
			int j, last;
			// stores the first element of array
			last = arr[arr.length-1];
			for (j = arr.length-1; j > 0; j--) {
				// shift element of array by one
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
			// Displays resulting array after rotation
		}
		System.out.println();
		System.out.println("Array after right rotation");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
