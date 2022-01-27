package operators;

public class Unary3 {

	public static void main(String[] args) {
		
	
	int	a = -5, b;
		b = a-- + --a + --a + a;
		    
		System.out.println("a: "+ a);//-8
		System.out.println("b: "+b);//-28
		

		a = 21;
		b = --a + --a + --a + a + ++a + a++;
		    
		System.out.println("a: "+a);//20
		System.out.println("b: "+b);//113
		
		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		   -2    -3    -2  -2   0       0   1
		   -2    -3    -2   -1     0    1
		   
		System.out.println("a: "+a);//
		    System.out.println("b: "+b);//
		    
		    int x=-9,y;
		    y= --x + x + x-- + ++x + x   + x--;
   //initial   -10  -10  -10   -10   -10    -10
   //final	   -10  -10  -11    -10   -10   -11
		      
		    System.out.println("x: "+ x);//-11
		    System.out.println("y: "+ y);//-60
	}

}
