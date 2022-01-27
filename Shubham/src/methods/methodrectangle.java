package methods;

public class methodrectangle {
	
	
	int length(double a) {
		System.out.println("non static with parameter");
		int res=10;
		return res;
	}
	
	float width(float b) {
		float val=20;
		return val;
		
		
	}
	public static void main(String[] args) {
		methodrectangle m1=new methodrectangle();
	int res=m1.length(10);
	float val=m1.width(20);
	System.out.println(res*val);
		res=20;
		val=25;
		System.out.println(res*val);
		
	}

}
