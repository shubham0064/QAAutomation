package PracticeProgram2;

public class LargestElement {

	static int arr[] = { 10, 325, 50, 201 };

	static int largest() {
		int i;

		int max = arr[0];

		for (i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String args[]) {
		System.out.println("Largest Element is: "+LargestElement.largest());
	}
}
