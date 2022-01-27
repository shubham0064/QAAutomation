package DerivedCasting;

class JD{
	public void printme1() {
		System.out.println("JD print method");
	}
	void display() {
		System.out.println("JD display");
	}
}
class Java extends JD{
	public void printme2() {
		System.out.println("Java print method");
	}
	void display() {
		System.out.println("Java display");
	}
}
class Android extends Java{
	public void printme3() {
		System.out.println("Android print method");
	}
	void display() {
		System.out.println("Android display");
	}
}
public class DerivedCasting3 {

	public static void main(String[] args) {
		JD d = new Android();
		d.printme1();
		d.display();
		System.out.println("____________");
		
		Java j2 = (Java)d;
		j2.display();
		j2.printme1();
		j2.printme2();
		System.out.println("__________");
		
		Android a1 = (Android)d;
		a1.display();
		a1.printme1();
		a1.printme2();
		a1.printme3();
	}

}
