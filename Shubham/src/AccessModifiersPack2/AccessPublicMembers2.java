package AccessModifiersPack2;

import AccessModifiers.Modifiers;
import AccessModifiers.PublicMembers;

public class AccessPublicMembers2 {

	public static void main(String[] args) {
		PublicMembers p1=new PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	
		Modifiers m = new Modifiers();
		System.out.println(m.num4);
		
		//using fully qualified class name---> packagename.classname
//		AccessModifiers.Modifiers a1 = new AccessModifiers.Modifiers();
//		System.out.println("Accessing Default members from another class outside package");
//		System.out.println(p1.accNum);
//		p1.displayAccNum();
//
//		AccessModifiers.PublicMembers a2 = new AccessModifiers.PublicMembers();
//		System.out.println(m.num4);
	}
}
 