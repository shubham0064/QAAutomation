package This;

class A2{
	
	A2(){
		
		this(5);
		System.out.println("zerom para const");
	}
	
	A2(int a){
		System.out.println("This is int "+a);
	}
}
class ThisStatement2 {
	public static void main(String[] args) {
		A2 a2 = new A2(10);
	}

}
