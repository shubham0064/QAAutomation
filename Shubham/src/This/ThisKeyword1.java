package This;

class Student {
	int rollno;
	float fee;

	Student(int rollno, float fee) {
		rollno = rollno;
		fee = fee;
		
	}

	void display() {
		System.out.println(rollno + " " + fee);
	}
}

class ThisKeyword1 {

	public static void main(String[] args) {
		Student s1 = new Student(222,1200f);
		Student s2 = new Student(444,5600f);
		
		s1.display();
		s2.display();
		
	}
}
