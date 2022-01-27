package operators;

public class Unary2 {

	public static void main(String[] args) {
		
		int a=77, b;
		b=a++;
		int x=a, y;
		y=++x;
		
		System.out.println(x);//79
		System.out.println(a);//78
		System.out.println(b);//77
		System.out.println(x);//79
		System.out.println(y);//79
		
		int p=10, q=20, res;
		res= p++ + --q;
		
		System.out.println("res:"+ res);//29
		System.out.println("p: "+ p);//11
		System.out.println("q: "+ q);//19
		
		int res1 = ++p + ++q;
		System.out.println("res1: "+res1);//32
		System.out.println("p: "+ p);//12
		System.out.println("q: "+ q);//20
	}

}
