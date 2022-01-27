package methods;

public class Method1 {
	
	static void sum(int num1,int num2) {
		System.out.println("Addition of two numbers: "+(num1+num2));
	}
	static double addition(int num1,int num2,int num3) {
	 
		return (num1+num2+num3);
	}
	public static void main(String[] args) {
		
		Method1.sum(20, 30);
		 System.out.println("Addition of three numbers: "+Method1.addition(25, 50, 75));
		 double res=addition(20, 30, 50);
		 System.out.println("Sum of three numbers: "+res);

	}
	

}
