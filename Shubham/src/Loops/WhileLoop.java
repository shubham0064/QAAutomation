package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		int i=0;
		System.out.println("Printing numbers from 1 to 5");
		while(i<5){
			System.out.println("hello "+i);
			i++;
		}
				//In while loop condition comes first then body
				//while loop can be executed same by for loop as below
		System.out.println("___________");
		for(int a=0;a<=5;a++) {
			System.out.println("hello "+a);
		}
		System.out.println("___________");
	/*	int a=5;
		
		while(a>0) {
			System.out.println("BYE: "+a);
			a--;
	*/	
		
	}
		

	}


