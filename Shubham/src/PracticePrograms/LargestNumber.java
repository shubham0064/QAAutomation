package PracticePrograms;

public class LargestNumber {

	public static void main(String[] args) {
		int num1 = 100, num2 = 80, num3 = 66;
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("largest number is: "+num1);
		}else if(num2>=num1 && num2>=num3) {
			System.out.println("largest number is: "+num2);
		}else {
			System.out.println("largest number is: "+num3);
		}

	}

}
