package PracticeProgram2;

class Array {
	// creating a method which receives an array as a parameter
	static void small(int arr[]) {
		int small = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (small > arr[i]) {// 4>50 ==>min=4
				small = arr[i];
			}
		}
		System.out.println("Smallest number in array is: "+small);
	}
}
public class SmallestNumber {
	public static void main(String args[]) {
		int a[] = { 33, 13, 4, 50,15,1 };
		Array.small(a);// passing array to method
		
	}
}
