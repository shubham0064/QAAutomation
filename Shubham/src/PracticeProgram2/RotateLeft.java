package PracticeProgram2;

public class RotateLeft {
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
			int j, first;
			// stores the first element of array
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				// shift element of array by one
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
			// Displays resulting array after rotation
		}
		System.out.println();
		System.out.println("Array after left rotation");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
