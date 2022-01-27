package AccessModifiers;

public class AccessPrivateMembers {

	public static void main(String[] args) {
		PrivateMembers p1 = new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
// compiler gives error bcz members are private in privatemembers class nd not visible here