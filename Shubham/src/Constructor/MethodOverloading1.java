package Constructor;

class Multiply {


		Multiply() {
			System.out.println("Zero-para cons..");
		}
		
		void mul(int a, int b) {
			System.out.println("Mul of two = " + (a * b));
		}
		
		void mul(int a, int b, int c) {
			System.out.println("Mul of three= " + (a * b * c));
		}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		Multiply m1 = new Multiply();
		m1.mul(4, 2);
		m1.mul(3,2,4);
		

	}

}
