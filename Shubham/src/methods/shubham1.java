package methods;

public class shubham1 {
	
	static int i=10;
		   int j=20;
    static void it() {
    	
    	System.out.println("It method");
    }
    public void dance() {
    	System.out.println("Dance method calling");
    }

	public static void main(String[] args) {
		
		System.out.println(shubham1.i);
		shubham1 s1=new shubham1();
		System.out.println(s1.j);
		
		shubham1.it();
	    
	    s1.dance();
		
		
	

	}

}
