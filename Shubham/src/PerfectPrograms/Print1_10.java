package PerfectPrograms;

class Print1_10 {    // using recursion method
	public static void print(int num) {
		if (num <= 10) {
			System.out.println(num);
			print(num + 1);
		}
	}
	public static void main(String args[]) {
		Print1_10.print(1);
	}
}

/* Using for loop print 1 to 10
 * for(int i=0;i<=10;i++) {
		System.out.println(i);
	}
 */