package IfConditions;

public class IfCondition11 {

	public static void main(String[] args) {
		int num1=55, num2=30;
		
		if(!(num1==num2)) {
			System.out.println("Number1 is greater than number2");
		}else {
			System.out.println("Number1 is smaller than number2");
		}
		
		if(num1>num2) {
			System.out.println("Number1 is greater than number2");
		}else {
			System.out.println("Number1 is smaller than number2");
		}
		
		
		if(num1>=num2) {
			System.out.println("Number1 is either equals to number2 or greater than number2");
		}else {
			System.out.println("Number1 is smaller than number2");
		}
		
		
		if(num1==num2 || num1>num2) {
			System.out.println("Number1 is neither equals to number2 nor greater than number2");
		}else {
			System.out.println("Number1 is smaller than number2");
		}
		
		if(num1>=num2 && num1>num2) {
			System.out.println("Number1 is either equals to number2 or greater than number2");
		}else {
			System.out.println("Number1 is smaller than number2");
		}
		
		int sub1=50,sub2=30;
		if(sub1>35 && sub2>35) {
			System.out.println("Pass...");
		}else {
			System.out.println("Fail...");
		}
		
		
	//	if(num1 == num2) {
	//	System.out.println("Number1 is equals to number2");
	//	}else {
	//	System.out.println("Number1 is greater than number2");
	//	}else {
	//	System.out.println("Number1 issmaller than number2");
	//	}

	}

}
