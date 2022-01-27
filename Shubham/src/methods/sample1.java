package methods;

public class sample1 {
	
	int age=25;
	void display() {
		System.out.println("Display  method");
	}

	public static void main(String[] args) {
	
		sample1 s1=new sample1();
		System.out.println(s1.age);
		
		s1.display();
		s1.age=30;
		System.out.println(s1.age);
		
		sample1 s2=new sample1();
		System.out.println(s2.age);
		s2.display();

	}

}
