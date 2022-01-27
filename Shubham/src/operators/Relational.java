package operators;

public class Relational {
	
	public static void main(String[] args) {
		
		int num1 = 12, num2 = 4;

		System.out.println("num1: "+num1+" num2: "+num2);
		
		System.out.println("num1 == num2"+(num1 == num2));//false
		System.out.println("num1 != num2"+(num1 != num2));//true
		System.out.println("num1 > num2"+(num1 > num2));//true
		System.out.println("num1 < num2"+(num1 < num2));//false
		System.out.println("num1 >= num2"+(num1 >= num2));//true
		System.out.println("num1 <= num2"+(num1 <= num2));//false
	}

}
