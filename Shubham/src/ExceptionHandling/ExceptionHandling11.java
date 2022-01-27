package ExceptionHandling;

public class ExceptionHandling11 {

	public static void validateAge(int age) {
		
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}else {
			System.out.println("Eligible to vote");
		}
	}
	
	public static void main(String[] args) {

		validateAge(20);
		
	}

}
