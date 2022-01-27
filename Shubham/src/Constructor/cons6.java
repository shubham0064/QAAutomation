package Constructor;

class C{
	double i = 10.23;
	
	C(double j){
		System.out.println("Running class C constructor");
		i = j;
	}
}
public class cons6 {
	
	public static void main(String[] args) {
		System.out.println("Main() of cons6 is started");
		C b1 = new C(15.34);
		System.out.println("class C global variable is "+b1.i);
		System.out.println("__________________________");
		C b2 = new C(45.15);
		System.out.println("class C global variable is "+b2.i);
		System.out.println("Main() of cons6 ends here...");
	}

}
