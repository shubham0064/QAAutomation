package ExceptionHandling;

public class ExceptionHandling4 {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30/0;
		}catch(ArrayIndexOutOfBoundsException x) {
			System.out.println("EXception is: "+x);
		}catch(Exception y) {
			System.out.println("Parent Exception is: "+y);
		}
		
		try {
			int a[] = new int[5];
			a[5] = 30 / 2;//
		}catch(ArithmeticException p) {
			System.out.println("Exception is: "+p);
		}catch(ArrayIndexOutOfBoundsException q) {
			System.out.println("Exception is: "+q);
		}catch(Exception r) {
			System.out.println("Exception is: ");
		}
		/**
		* try block can have multiple catch block, but only one catch block will be executed 
		* try can handle only one abnormal condition at a time
		*/
		
		
		
		
		
		
		
	}

}
