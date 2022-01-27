package AccessModifiersPack2;

public class AccessPublicMembers3 {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		AccessModifiers.PublicMembers a = new AccessModifiers.PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(a.accNum);
		a.displayAccNum();
	}

}
