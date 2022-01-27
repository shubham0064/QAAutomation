package methods;

public class methodsquare {
	
     long A=5l, B=10l;

	public static void main(String[] arg) {
		
		System.out.println(".....Area of square.....");
		
		methodsquare m1=new methodsquare();
		
		System.out.println("Side A = "+m1.A);
		System.out.println("Side B = "+m1.B);
		
		System.out.println("Area of square1 = "+(m1.A*m1.B));
		System.out.println("_________________________________");
		m1.A=6l;
		m1.B=6l;
		System.out.println("Area of square2 = "+(m1.A*m1.B));
	System.out.println("___________________________________");
	
	    methodsquare m2=new methodsquare();
	    m2.A=7;
	    m2.B=7;
	    System.out.println("Area of square3 = "+(m2.A*m2.B));
	    
	    int age=6;
	    System.out.println("Area of square4 = "+((m2.A*m2.B)+age));
		
		
		
 

	}

}
