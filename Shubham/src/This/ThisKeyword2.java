package This;

public class ThisKeyword2 {
	int x;
	ThisKeyword2(int x){
		
		this.x = x;
	}
	public static void main(String[] args) {
		ThisKeyword2 obj = new ThisKeyword2(5);
		System.out.println(obj.x);
	}
	

}
