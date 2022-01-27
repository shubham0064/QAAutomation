package oops;

class trail {
	int empAge;

	trail(int age) {
		empAge = age;
	}

	void display(int i) {
		empAge = i;
		System.out.println(empAge);
	}

	void display() {
		empAge = 50;
		System.out.println(empAge);
	}
}

public class SampleDemo extends trail {
	SampleDemo() {
		super(15);
	}

	public static void main(String args[]) {
		SampleDemo s = new SampleDemo();
		System.out.println(s.empAge);
		s.display(25);
		System.out.println(s.empAge);
		s.display();
		System.out.println(s.empAge);

	}
}
