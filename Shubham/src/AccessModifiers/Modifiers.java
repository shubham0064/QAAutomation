package AccessModifiers;

public class Modifiers {
	
	private int num1 = 10;
	int num2 = 20;
	protected int num3 = 30;
	public int num4 = 40;
	
	public static void main(String[] args) {
		Modifiers m = new Modifiers();
		System.out.println(m.num1);
		System.out.println(m.num2);
		System.out.println(m.num3);
		System.out.println(m.num4);
	}
}
class AccessModifiers{
	
	public static void main(String args[]) {
		Modifiers m = new Modifiers();
		System.out.println(m.num1);  // error bcz num1 is private variable nd accesible within same class
		System.out.println(m.num2);
		System.out.println(m.num3);
		System.out.println(m.num4);
	}
}