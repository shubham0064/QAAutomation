package oops;
class fruit1{
	int fruitage;
	fruit1(){
		System.out.println("Im fruit class constr");
		fruitage=7;
		}
	public void taste() {
		System.out.println("Taste is sweet");
	}
}
class orange extends fruit1{
	int fruitage;
	orange(){
		System.out.println("Im orange constr");
		fruitage=10;
	}
	public void shape() {
		System.out.println("shape is round");
		System.out.println("Orange fruitAge: "+fruitage);
		System.out.println("Fruits fruitAge: "+super.fruitage);
		taste();//super.taste();
	}
}
public class Inheritance7 {
	public static void main(String args []) {
		orange o = new orange();
		o.shape();
		
	}
}
/**
 * this(): instance of current class,is used to call another constructor of same class bases on its parameter
 * super(): instance of parent class,is used to call parent class constructor from child class based on its parameter
 * 
 * this: instance of current class, use to differentiate local and global variable when they have same name and used
 * only in non-static method
 * 
 * super: instance of parent class, use to differentiate child class and parent class variable/method when they have
 * same name and used only in non-static method
 */
