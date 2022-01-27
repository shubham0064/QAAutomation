package methods;

public class Test123 {
	
	static int age=30;
	
	double salary=25000;
	
	static int display() {
		System.out.println("Display method");
		return 10;
	}
	double call() {
		System.out.println("call method");
		return 25.33;
	}

	public static void main(String[] args) {
		Test123.display();
		
		System.out.println(Test123.age);
		//OR
		System.out.println(age);
		
		
		Test123 t1=new Test123();
		System.out.println(t1.salary);
		t1.call();
		
		Test123 t2=new Test123();
		t2.salary=15000;
		System.out.println(t2.salary);
		t2.call();
		
		
		
		
		


	}

}
