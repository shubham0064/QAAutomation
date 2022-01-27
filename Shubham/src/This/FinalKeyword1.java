package This;

public class FinalKeyword1 {
	final int speedlimit = 90;

	void run() {
		speedlimit = 100;
		System.out.println(speedlimit);
	}

	public static void main(String[] args) {
		new FinalKeyword1();
		

	}
	

}
// here literal value(90) is initialized in the variable int
//bcoz of that it is finalized and we can't reinitialize value of identifier(speedlimit) so it throws error