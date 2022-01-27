package operators;

public class Unary {

	public static void main(String[] args) {
		
		int a=20,
			b=a;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		int k = ++a;
		System.out.println("k: " + k);//21
		System.out.println("a: " + a);//21
		
		int j = k++;
		System.out.println("k: "+ k);//22
		System.out.println("j: "+ j);//21
		
		
		int r = 21;
		System.out.println("r: "+ r++);//21
		System.out.println("r: "+ r);//22
		System.out.println("r: "+ ++r);//23
		System.out.println("r: "+ r);//23

		int x = 105;
		System.out.println("x: "+ --x);//104
		System.out.println("x: "+ x);//104
		System.out.println("x: "+ x--);//104
		System.out.println("x: "+ x);//103

	}
	}

