package PracticePrograms;

public class AsciiValue {

	public void letter() {
		System.out.println("enter value");
	}
	char ch = 'A';
	int ascii = ch;
	public static void main(String[] args) {
		
		char ch = 'A';
		int ascii = ch;
		System.out.println("Enter a character: "+ch);
		System.out.println("ASCII value of "+ch+ " is:"+ascii);
		
		 AsciiValue A1=new AsciiValue();
	    System.out.println(A1.ascii);
	    A1.ascii='D';
	    System.out.println(A1.ascii);
	    A1.ascii='Z';
	    System.out.println(A1.ascii);
	    A1.ascii='M';
	    System.out.println(A1.ascii);
	}
	
}

