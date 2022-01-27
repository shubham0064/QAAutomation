package Constructor;

class ConstructorOverloading2 {

	int age;
	double salary;
	
	
	ConstructorOverloading2(){
		System.out.println("____zero parameterized cons starts___");
		System.out.println("____no parameter___");
		System.out.println("_____zero para. cons. ends___");
	}
	
	ConstructorOverloading2(int a){
		System.out.println("____parameterized cons starts___");
		System.out.println("____int parameter___");
		age = a;
		System.out.println("_____ para. cons. ends___");
	}
	
	ConstructorOverloading2(double b){
		System.out.println("____ parameterized cons starts___");
		System.out.println("____double parameter___");
		salary = b;
		System.out.println("_____para. cons. ends___");
	}
	
	ConstructorOverloading2(int a, double b){
		System.out.println("____ parameterized cons starts___");
		System.out.println("____int, double parameter___");
		age = a;
		salary = b;
		System.out.println("_____ para. cons. ends___");
	}
	
	
	
	public static void main(String[] args) {
		ConstructorOverloading2 c1 = new ConstructorOverloading2();
		System.out.println("After Zero-para constructor,Age= "+c1.age);
		System.out.println("After Zero-para constructor,Salary= "+c1.salary);
		
		ConstructorOverloading2 c2 = new ConstructorOverloading2(7);
		System.out.println("After int-para constructor,Age= "+c2.age);
		System.out.println("After int-para constructor,Salary= "+c2.salary);
		
		ConstructorOverloading2 c3 = new ConstructorOverloading2(42.2);
		System.out.println("After double-para constructor,Age= "+c3.age);
		System.out.println("After double-para constructor,Salary= "+c3.salary);
		
		ConstructorOverloading2 c4 = new ConstructorOverloading2(65,99.99);
		System.out.println("After int-double-para constructor,Age= "+c4.age);
		System.out.println("After int-double-para constructor,Salary= "+c4.salary);
		

	}

}
