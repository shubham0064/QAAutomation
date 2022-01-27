package PracticeProgram2;

public class SmallestElement {
	static int arr[] = { 10, 325, 50, 201 };

	static int Smallest() {
		int i;

		int min = arr[0];

		for (i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String args[]) {
		System.out.println("Smallest Element is: "+SmallestElement.Smallest());
	}
}

