package Constructor;

public class ThisKeyword {
	
	static int age;
	int salary;
	int empID;
	
	void display(int salary) {
		System.out.println("salary: "+salary);
		
	}

	public static void main(String[] args) {
		int age = 25;
		System.out.println("age: "+age);
		System.out.println("age: "+ThisKeyword.age);
		
		int salary = 25000;
		int empID = 250;
		System.out.println(" local salary: "+salary);
		System.out.println(" local empID: "+empID);
		ThisKeyword t1 = new ThisKeyword();
		System.out.println("Global salary: "+t1.salary);
		System.out.println("Global empId: "+t1.empID);
		t1.display(45000);
		System.out.println("Global salary: "+t1.salary);
		ThisKeyword t2=new ThisKeyword();
		System.out.println("t2: Global EmpID: "+t2.empID);
		System.out.println("t2: Global Salary: "+t2.salary);
		t1.display(45000);
		
		

	}

}
