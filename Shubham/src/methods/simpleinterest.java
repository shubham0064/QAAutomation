package methods;

public class simpleinterest {

	public static void main(String[] args) {

		float principle=2000, roi=6, time=3, interest;
		System.out.println("Enter the principle: "+principle);
		System.out.println("Enter the rate of interest: "+roi);
		System.out.println("Time in duration: "+time);
		interest=(principle*roi*time)/100;
		System.out.println("Simple interest is : "+interest);

	}

}
