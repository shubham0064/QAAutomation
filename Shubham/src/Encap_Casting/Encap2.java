package Encap_Casting;

class EncapsulationDemo{
	private int ssn;
	private String empname;
	private int empage;
	
	// Getter method
	public int getssn() {
		return ssn;
	}
	public String getempname() {
		return empname;
	}
	public int getage() {
		return empage;
	}
	// Setter method
	public void setssn(int newvalue) {
		ssn = newvalue; 
	}
	public void setempname(String namevalue) {
		empname = namevalue;
	}
	public void setage(int newage) {
		empage = newage;
	}
}
public class Encap2 {

	public static void main(String[] args) {
		EncapsulationDemo e = new EncapsulationDemo();
		System.out.println(e.getempname());
		System.out.println(e.getssn());
		System.out.println(e.getage());
		e.setssn(111);
		e.setempname("SHUBHAM");
		e.setage(25);
		System.out.println(e.getempname());
		System.out.println(e.getssn());
		System.out.println(e.getage());
	}

}
