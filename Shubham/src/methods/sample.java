package methods;

public class sample {
	
	static int empID=250;
	
	double empSalary=25;
	
	public static int getempID() {
		System.out.println("hi...You are in getempID..");
		return empID;
	}
	
	public double getSalary() {
		System.out.println("hi...You are in getSalary...");
		return empSalary ;
	}

	public static void main(String[] args) {
		System.out.println(sample.empID);
		
		sample s1=new sample();
		System.out.println(s1.empSalary);
		
		sample.getempID();
		s1.getSalary();
		


	}

}
