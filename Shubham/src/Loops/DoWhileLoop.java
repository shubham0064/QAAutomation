package Loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		// In do-while loop body comes first then condition
		
		//while---> check condition--->body
		//do-while--->first body--->condition
		
		int c = 10;
		System.out.println("Printing all numbers from 10 till 0");
		do {
			System.out.println(c);
			c--;
		}while (c>0);
		

	}

}
