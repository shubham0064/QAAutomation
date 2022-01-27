package Constructor;

class ConstructorOverloading1 {

	ConstructorOverloading1(){
		System.out.println("zero parameterized");
		System.out.println("having no parameter");
	}
	
	ConstructorOverloading1(int a){
		System.out.println("parameterized");
		System.out.println("having int parameter");
	}
	
	ConstructorOverloading1(double b){
		System.out.println("parameterized");
		System.out.println("having double parameter");
	}
	
	ConstructorOverloading1(int a, double b, int c){
		System.out.println("parameterized");
		System.out.println("having int,double,int parameter");
	}
	
	ConstructorOverloading1(double a,int b,int c){
		System.out.println("paramterized");
		System.out.println("having double,int,int parameter");
	}
	
	public static void main(String[] args) {
		ConstructorOverloading1 c1 = new ConstructorOverloading1();
		ConstructorOverloading1 c2 = new ConstructorOverloading1(10);
		ConstructorOverloading1 c3 = new ConstructorOverloading1(33.11);
		ConstructorOverloading1 c4 = new ConstructorOverloading1(10,20.10,45);
		ConstructorOverloading1 c5 = new ConstructorOverloading1(55.33,17,16);
	}

}
