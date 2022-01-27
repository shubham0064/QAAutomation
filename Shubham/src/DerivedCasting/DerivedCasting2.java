package DerivedCasting;

class Member{
	String name;
	long phone;
	void chat() {
		System.out.println(name+" chats in whtspp group");
	}
}
class Admin extends Member{
	void adduser() {
		System.out.println(name +" adding user in wp group");
	}
}
public class DerivedCasting2 {

	public static void main(String[] args) {
		Member m1 = new Admin();
		m1.name= "shubham";
		m1.phone = 02422;
		m1.chat();
		
		
		
//		
//		Member m2 = (Member)m1;
//		m2.chat();
//		
//		Admin a = (Admin)m1;
//		a.chat();
//		a.adduser();
//		m1.name="shubh";
//		m1.phone=1212;
//		System.out.println(m1.name);
//		System.out.println(m1.phone);
	}

}
