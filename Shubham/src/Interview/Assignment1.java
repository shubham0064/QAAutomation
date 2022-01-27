package Interview;

class Assignment {
	public void reverse(int num) {

		int rem, rev = 0;

		while (num != 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);

	}

	public void palindrome(int n) {
		int rem, rev = 0, temp; // temp = original integer
		// rev = reversed integer

		temp = n;

		while (n != 0) {

			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println(temp + " is a palindrome");
		} else {
			System.out.println(temp + " is not a palindrome");
		}
	}

	public void leapyear(int year) {

		if (year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else if (year % 100 == 0) {
			System.out.println(year + " is not a leap year");
		} else if (year % 4 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}

class Assignment1 extends Assignment {
	public void reverse() {
		super.reverse(456);
		System.out.println("This is reverse overidding method");
	}

	public void palindrome() {
		super.palindrome(6585);
		System.out.println("This is palindrome overidding method");
	}

	public void leapyear(int year) {
		super.leapyear(1995);
		System.out.println("This is leapyear overidding method");
	}

	void display() {
		System.out.println("Reverse display method");
	}

	public static void main(String args[]) {
		Assignment1 a = new Assignment1();
		a.reverse(321);
		a.palindrome(51548);
		a.leapyear(2001);
		a.display();

	}
}
