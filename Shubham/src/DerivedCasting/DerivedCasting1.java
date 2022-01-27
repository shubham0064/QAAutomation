package DerivedCasting;

class GP{
	void myhome() {
		System.out.println("GP home");
	}
}
class Parent extends GP{
	void show() {
		System.out.println("show method parent");
	}
	void callme() {
		System.out.println("callme method parent");
	}
}
class Child extends Parent{
	void readme() {
		System.out.println("readme method children");
	}
}
public class DerivedCasting1 {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.show();
		p1.callme();
		p1.myhome();
		
		Child c1 = new Child();
		c1.readme();
		c1.callme();
		c1.myhome();
		c1.show();
		
		//...........
		Parent p2 = new Child();
		p2.callme();
		p2.myhome();
		p2.show();
		
		Parent p3 = (Parent)c1;
		p3.callme();
		p3.myhome();
		p3.show();
		
		GP gp =(GP)c1;
		gp.myhome();
		
	}

}
