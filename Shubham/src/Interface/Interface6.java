package Interface;

interface Animal{
	int age = 25;
	void animalsound();
	void sleep();
}
class Pig implements Animal{
	public void animalsound() {
		System.out.println("wee wee");
	}
	public void sleep() {
		System.out.println("Zzzz");
	}
}
class Interface6 {
	public static void main(String args []) {
		Pig obj = new Pig();
		obj.animalsound();
		obj.sleep();
		System.out.println(Animal.age);
		//Animal.age=50;
		//in above statement animal value cant be reassigned bcoz its default public static final
	}
}
