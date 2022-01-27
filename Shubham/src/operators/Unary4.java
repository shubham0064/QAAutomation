package operators;

public class Unary4 {

	public static void main(String[] args) {
		int a=0,b;
		b=a++ + ++a + ++a + a;
		
    	System.out.println("a: "+a);//3
     	System.out.println("b: "+b);//8
     	
     	a=0;
     	b=a-- + --a + --a + a;
        
     	System.out.println("a: "+a);//-3
     	System.out.println("b: "+b);//-8
     	
     	a=0;
     	b=--a + --a + --a + a + ++a + a++;
     	System.out.println("a: "+a);//-1
     	System.out.println("b: "+b);//-13
     	
     	a=0;
     	b=a-- + a + ++a + a++ + ++a + a++ + a;
     	System.out.println("a: "+a);//3
     	System.out.println("b: "+b);//6

	}

}
