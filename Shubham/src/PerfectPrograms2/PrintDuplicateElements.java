package PerfectPrograms2;

public class PrintDuplicateElements {

	public static void main(String[] args) {

		String arr[] = { "java", "javascript", "c++", "python", "java", "c++" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])

					System.out.println(arr[i]);

			}
		}
	}

}
