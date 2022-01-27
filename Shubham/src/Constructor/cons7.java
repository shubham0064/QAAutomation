
package Constructor;

class B{
	int i = 10;
	B(){
		System.out.println("Running class B constructor");
		i = 23;
	}
}
public class cons7 {

	public static void main(String[] args) {
		System.out.println("Main() of cons7 is started");
		B b1 = new B();
		System.out.println("class B global variable is "+b1.i);
		System.out.println("_____________________________");
		B b2 = new B();
		System.out.println("class B global variable is "+b2.i);
		System.out.println("Main() of cons7 ends here...");

	}

}
