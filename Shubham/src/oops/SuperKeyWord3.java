package oops;

class Person {
	int Id;
	String name;

	Person(int Id, String name) {
		this.Id = Id;
		this.name = name;
	}
}

class emp extends Person {
	float salary;

	emp(int Id, String name, float salary) {
		super(Id, name);
		this.salary = salary;
	}

	void display() {
		System.out.println("Id = " + Id + ", name = " + name + ", salary = " + salary);
	}
}

class SuperKeyWord3 {
	public static void main(String[] args) {
		emp e = new emp(007, "JamesBond", 2500.0f);
		e.display();
	}
}
