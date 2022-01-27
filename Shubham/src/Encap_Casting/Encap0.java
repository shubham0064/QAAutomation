package Encap_Casting;

class Demo{
	private int empID=1000;
	private double salary =45000;
	
	// get values of private variables
	public int getempID() {
		return empID;
	}
	public double getsalary() {
		return salary;
	}
	
	// set values of private variables
	public void setempID(int ID) {
		empID = ID;     //this.empID = ID;
	}
	public void setsalary(double sal) {
		salary = sal;   //this.salary = sal;
	}
}	
public class Encap0 {
	public static void main(String[] args) {
		Demo d = new Demo();
		//System.out.println(d1.empID);// compile time error 
		//System.out.println(d1.salary);// compile time error
		
		System.out.println(d.getempID());
		System.out.println(d.getsalary());
		
		double updatedSalary = d.getsalary()+14000;
		System.out.println(updatedSalary);
		System.out.println("________________");
		
		d.setempID(2000);
		d.setsalary(76000);
		System.out.println(d.getempID());
		System.out.println(d.getsalary());
	}

}
