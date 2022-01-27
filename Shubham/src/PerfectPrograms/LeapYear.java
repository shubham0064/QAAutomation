package PerfectPrograms;

public class LeapYear {

	public static void year(int year) {

		if ((year % 400 == 0) || (year % 4 == 0)) {
			System.out.println(year + " is a leap year..");
		} else {
			System.out.println("Not a leap year");
		}

	}

	public static void main(String[] args) {

		year(2021);

	}
}