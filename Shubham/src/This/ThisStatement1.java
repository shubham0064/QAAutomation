package This;

class A1{
	
	A1(){
		this(10.25);
		System.out.println("This is zero para constr");
	}
	
	A1(double d){
		this(10);
		System.out.println("This is double "+ d);
	}
	
	A1(int a){
		System.out.println("This is int "+a);
	}
}
class ThisStatement1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		
	}
}
/**
* this----> keyword
* this()---> statement
*/