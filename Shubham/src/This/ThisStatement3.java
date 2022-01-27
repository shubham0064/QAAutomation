package This;

class Student101 {

	int rollno;
	float feee;

	Student101(int rollno) {
		this.rollno = rollno;
	}

	Student101(int rollno, float feee) {
		this(rollno);
		this.feee = feee;
	}

	void display() {
		System.out.println(rollno + " " + feee);
	}
}

class ThisStatement3 {
	public static void main(String[] args) {
		Student101 s1 = new Student101(45);
		System.out.println( s1.rollno+s1.feee);

		Student101 s2 = new Student101(11, 2200f);
		System.out.println(s2.rollno+ s2.feee);
		s1.display();
		s2.display();
	}
}
