package PracticeProgram2;
NOT UNDERSTOOD
public class RemoveDuplicateElement {
	public static void main(String args[]) {
	int[] arr = new int[] { 1, 1, 3, 7, 7, 8, 9, 9, 9};
	int current = arr[0];
	boolean res = false;

	for(
	int i = 0;i<arr.length;i++)
	{
		if (current == arr[i] && !res) {
			res = true;
		} else if (current != arr[i]) {
			System.out.print(" "+current);
			current = arr[i];
			res = false;
			
		}
	}
	System.out.print(current);

}
}
