package methods;

public class methodcircle {
	double r=12;
	

	public static void main(String[] args) {
		
		methodcircle c1=new methodcircle();
		
     System.out.println("Area of circle 1: "+3.14*(c1.r)*(c1.r)+"sqm");
     
     c1.r=22;
     
     System.out.println("Area of circle 2: "+3.14*(c1.r)*(c1.r));
		methodcircle c2=new methodcircle();
	 c2.r=10;
		System.out.println("Area of circle 3: "+3.14*(c2.r)*(c2.r));

	}

}
