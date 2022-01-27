package StringBuffer;

final class TestImmutableClass{
	final String name;
	final int salary;
	TestImmutableClass(String s1,int num1){
		name=s1;
		salary=num1;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}	
}

public class ImmutableClass {

	public static void main(String args[]) {

		TestImmutableClass t1 = new TestImmutableClass("Nitin",25000);
		System.out.println(t1.getName());
		System.out.println(t1.getSalary());
		System.out.println(t1.getClass());
		//change its data variable value create new object
		
		TestImmutableClass t2 = new TestImmutableClass("ketan",30000);
		System.out.println(t2.getName());
		System.out.println(t2.getSalary());
	}
}