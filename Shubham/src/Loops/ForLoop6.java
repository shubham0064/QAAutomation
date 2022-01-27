package Loops;

public class ForLoop6 {

	public static void main(String[] args) {
		
		
		//correct logic of printing even odd no
		for(int i=1;i<10;i++) {
			
			//OR if(i%2!=0)
			if(!(i%2==0)) {
				System.out.println(i);
			}
			
		}

		System.out.println("___________reverse_____________");
		
		for(int j=10;j>0;j--) {
			if(j%2!=0) {
				System.out.println(j);
			}
		}
	}

}
