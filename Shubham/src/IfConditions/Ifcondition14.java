package IfConditions;

public class Ifcondition14 {

	public static void main(String[] args) {
		//Nested if else condition
		//creating two variables for age and weight
		
		int age = 19;
		int weight = 75;
		
	    //applying condition on age and weight
		
		if(age>=18) {
			System.out.println("Candidate age is: "+age);
			if(weight > 50) {
				System.out.println("You are eligible to donate blood");
			}else {
				System.out.println("You are not eligible to donate blood");
			}
		} else {
				System.out.println("Age must be greater than 18");
			}
				
				
			}

	}


