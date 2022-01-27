package PracticePrograms;

public class Calculator {

	public static void main(String[] args) {

		int num1 = 10, num2 = 5, res;

		char op = '+';

		switch (op) {

		case '+':
			res = num1 + num2;
			System.out.println("Addition of " + num1 + " and " + num2 + " is: " + res);
			break;

		case '-':
			res = num1 - num2;
			System.out.println("Substraction of " + num1 + " and " + num2 + " is: " + res);
			break;

		case '*':
			res = num1 * num2;
			System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + res);
			break;

		case '/':
			res = num1 / num2;
			System.out.println("Division of " + num1 + " and " + num2 + " is: " + res);
			break;
		}

	}

}
