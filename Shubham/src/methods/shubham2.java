package methods;

public class shubham2 {
	
	static double d=50;
	        float f=60f;
	static int firstmethod() {
		System.out.println("First age display");
		return 0;
	}
	int secondmethod(int age) {
		System.out.println("Second age display: "+age);
		return 25;
	}
	long l=100;
	  
	   public static void main(String[] args) {
		System.out.println(shubham2.d);
		
		shubham2 s1=new shubham2();
		System.out.println(s1.f);
		shubham2.firstmethod();
		s1.secondmethod(25);
		
		System.out.println(s1.l);
		
		
		
		

	}

}
