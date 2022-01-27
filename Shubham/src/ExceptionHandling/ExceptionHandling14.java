package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling14 {

	// defining a method
		public static int divideNum(int m, int n) throws ArithmeticException
		{
			int div = m / n;
			return div;
		}

		// main method
		public static void main(String[] args) throws FileNotFoundException {
			ExceptionHandling14 obj = new ExceptionHandling14();
			try {
				System.out.println(obj.divideNum(45, 0));
			} catch (ArithmeticException e) {
				System.out.println("\nNumber cannot be divided by 0");
			}
			
			FileInputStream fis=new FileInputStream("fileLocation");
			System.out.println("Rest of the code..");
		}
	}