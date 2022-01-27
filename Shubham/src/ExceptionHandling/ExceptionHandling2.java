package ExceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		System.out.println("Program starts...");
		int empId[] = {10,20,30};
		try {
			System.out.println(empId[3]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Exception name: "+a);			
		}
		
		System.out.println("Program ends...");

		
		
		//System.out.println(empId[3]);
	}

}
