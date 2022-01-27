package AccessModifiers;

public class DefaultMembers {
	int accNum = 12345;
	void displayaccNum() {
		System.out.println("Account Num "+accNum);
	}
	public static void main(String args[]) {
		DefaultMembers p1 = new DefaultMembers();
		System.out.println(p1.accNum);
		p1.displayaccNum();
	}
}
class AccessDefaultMembers {

	public static void main(String[] args) {
		
		DefaultMembers p1=new DefaultMembers();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayaccNum();
	}
}