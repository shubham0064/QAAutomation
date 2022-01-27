package Constructor;

public class cons4 {

	
		
		int roll;
		double salary;
		
		cons4(int r,double s){
			roll = r;
			salary = s;
		}
		
		void display() {
			System.out.println(roll+" "+salary);
		}

		public static void main(String[] args) {
			
			cons4 c1 = new cons4(34,34.04);
			cons4 c2 = new cons4(35,35.05);
			
			c1.display();
			c2.display();
	}

}
