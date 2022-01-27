package PracticePrograms;

public class Swap {

	public static void main(String[] args) {
		int x = 10, y = 5;
		System.out.println("The value of x,y: "+x+","+y);
		
		
		System.out.println("Before swapping two numbers are: "+x+ " & " +y);
		x = x+y;//15
		y = x-y;//10
		x = x-y;//5
		

		System.out.println("After swapping two numbers are: "+x+ " & " +y);
	}

}
