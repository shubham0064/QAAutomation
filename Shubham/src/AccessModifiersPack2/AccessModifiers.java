package AccessModifiersPack2;

import AccessModifiers.Modifiers;

public class AccessModifiers extends Modifiers {

	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		Modifiers m = new Modifiers();
		System.out.println(a.num1);  // error bcz variable num1 is private in original pakage(AccessModifiers)
		System.out.println(a.num2);  // error bcz variable num2 is default in original pakage(AccessModifiers) nd only accessible within same package not in other
		System.out.println(a.num4);
	}

}
