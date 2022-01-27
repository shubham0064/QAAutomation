package DerivedCasting;

class Akshay{
	public void dance() {
		System.out.println("Akshay is dancing");
	}
}
class Shubham{
	public void dance() {
		System.out.println("shubham is dancing");
	}
}
class Azhar extends Akshay{
	public void dance1() {
		System.out.println("Azhar is dancing");
	}
}
public class DerivedCasting4 {

	public static void main(String[] args) {
		Akshay a = new Azhar();
		a.dance();
		
	}

}
