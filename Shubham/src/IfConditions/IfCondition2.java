package IfConditions;

public class IfCondition2 {
	public static void main(String args[]) {
		
		int number=52;
		if(number%2==0) {
		
		System.out.println("even number");//
		}else {
		System.out.println("odd number");
		//
		}
		System.out.println("________________________________________");
		
		CheckEvenOddNumber(710);
		CheckEvenOddNumber(713);
		
		System.out.println("________________________________________");
		
		IsNumberEvenOdd(200);
		IsNumberEvenOdd(233);
		
		System.out.println("________________________________________");
		
		IfCondition2.checkEvenOddNumber();
		
		
	}
	/**static method argument/parameter and return type as void
	 **/
		
		static void CheckEvenOddNumber(int num) {
			
			if(num%2==0) {
				System.out.println("Given number is even number: "+num);
			}else {
				System.out.println("Given number is odd number: "+num);
			}
			
			
	}
		/**static method argument and return type as boolean
		 **/
		
	
		static boolean IsNumberEvenOdd(int num) {
			
			if(num%2==0) {
				System.out.println("Number is even: "+num);
				return true;
			}else {
				System.out.println("Number is odd: "+num);
				return false;
			}
	}
		/**static method no argument and return type as void
		 **/
		
		static void checkEvenOddNumber() {
			int num=50;
			if(num%2==0) {
				System.out.println("void number is even number: "+num);
			}else {
				System.out.println("void number is odd number: "+num);
	        }
	}
		
		
		
		
		
	}


