package AccessModifiers;

public class PrivateMembers {

		private int accNum=12345;
		private void displayaccNum() {
			System.out.println("Account Number: "+accNum);
		}
		public static void main(String[] args) {
			PrivateMembers p1 = new PrivateMembers();
			System.out.println(p1.accNum);
			p1.displayaccNum();
	}
}	
class AccessPrivateMembers2 {

	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
//		System.out.println(p1.accNum);
//		p1.displayAccNum();
}
}