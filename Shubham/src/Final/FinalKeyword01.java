
package Final;

class FinalKeyword01 {
	public static void main(String[] args) {

		final int age = 30;
		System.out.println(age);
	//	age = 25;
		System.out.println("1st change in age: " + age);
	//	age = 20;
		System.out.println("2nd change in age: " + age);
	//	age = 15;
		System.out.println("3rd change in age: " + age);
	}

}
// anything declared with final keyword known as constant
// any variable declared with final keyword should be initialized at the same time 