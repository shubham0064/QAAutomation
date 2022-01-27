package SystemScanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int age;
		double salary;
		String name;
		boolean valid;		
		System.out.println("Get age value from console");
		age = scn.nextInt();
		System.out.println("Get salary value from console");
		salary=scn.nextDouble();				
		System.out.println("Get name value from console");
		name=scn.next();		
		System.out.println("Get valid value from console");
		valid=scn.nextBoolean();
		
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);
		System.out.println("name: "+name);
		System.out.println("valid: "+valid);
		System.out.println("*****************************************");
	}
}
