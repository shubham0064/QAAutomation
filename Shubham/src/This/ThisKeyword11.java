package This;

class Student1 {
	//Global Var
	int rollno;
	float fee;

	Student1(int rollno, float fee) {
	//  Global Var = Local Var;
		this.rollno = rollno;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + fee);
	}
}

class ThisKeyword11 {
	public static void main(String[] args) {
		Student1 s1 = new Student1(111, 4455f);
		s1.display();
	}
}
