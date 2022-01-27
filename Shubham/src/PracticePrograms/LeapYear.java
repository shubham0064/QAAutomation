package PracticePrograms;

public class LeapYear {

	public static void main(String[] args) {
		
	 CheckleapYear(2017);
	 CheckleapYear(2018);
	 CheckleapYear(2019);
	 CheckleapYear(2020);
	 CheckleapYear(2021);
	 

	
	}
		public static void CheckleapYear(int year) {
	
	if(year % 400 == 0) {
		System.out.println(year+" is a leap year");
	}else if (year % 100 ==0) {
		System.out.println(year+" is not a leap year");
	}else if (year % 4 == 0) {
		System.out.println(year+" is a leap year");
	}else {
		System.out.println(year+" is not a leap year");
	}
	

	}
}
