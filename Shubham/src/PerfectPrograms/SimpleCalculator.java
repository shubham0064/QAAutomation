package PerfectPrograms;

import java.util.Scanner;

public class SimpleCalculator {

	public static void calculator(char op) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1 = scn.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = scn.nextInt(), res;
		scn.close();
		
		switch (op) {
		case '+':
			res = num1 + num2;
			System.out.println("Addition is: " + res);
			break;
		case '-':
			res = num1 - num2;
			System.out.println("Subtraction is: " + res);
			break;
		case '*':
			res = num1 * num2;
			System.out.println("Multiplication is: " + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println("Division is: " + res);
			break;
		case '%':
			res = num1 % num2;
			System.out.println("MOdulus is: " + res);
			break;
		}
		

	}

	public static void main(String[] args) {

		calculator('*');
	
		

	}

}
