package Interface;

interface Printable1{
	void print();
}
interface Showable1{
	void print();
}
class Interface4 implements Printable1, Showable1 {
	public void print() {
		System.out.println("Print method");
	}
	public static void main(String args[]) {
		Interface4 obj = new Interface4();
		obj.print();
	}
}
