package oops;

class fruit{
	fruit(){
		System.out.println("fruit class constructor");
	}
	public void taste() {
		System.out.println("fruits are sweeet");
	}
}
class apple extends fruit{
	apple(){
		System.out.println("apple class constructor");
	}
	public void shape() {
		System.out.println("apple is round");
	}
}
public class Inheritance2 {
	public static void main(String args []) {
		apple a = new apple();
		a.taste();
		a.shape();
	}
}
