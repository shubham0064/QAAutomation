package This;

class ThisKeyword21 {
	int a;
	int b;
	
	ThisKeyword21(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void display()
	{
		System.out.println("a = "+ a +" b = "+b );
		
	}

	public static void main(String[] args)
	{
		ThisKeyword21 obj = new ThisKeyword21(10, 20);
		obj.display();
		ThisKeyword21 obj1 = new ThisKeyword21(11, 30);
		obj1.display();
		ThisKeyword21 obj2 = new ThisKeyword21(12, 40);
		obj2.display();
		
	}
}
