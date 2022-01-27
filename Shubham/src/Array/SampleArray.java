package Array;

import java.util.Arrays;

public class SampleArray {
	public static void main(String args[]) {
	//	int a = 10,b = 20,c = 30;
		
		int[] num= new int[3];
		num[0]= 10;
		num[1]= 20;
		num[2]= 30;
		
		int[] num1= {10,20,30};
		
		System.out.println("size of num1= "+num1.length);
		System.out.println("value of index1 element= "+num[1]);
		System.out.println("Printing all elements...");
		
		for(int i=0;i<num1.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("**************************");
		int[] num2=Arrays.copyOf(num1, 5);
		System.out.println("size of num2 : "+num2.length);
		for(int i=0;i<num2.length;i++) {
			System.out.println(num2[i]);
		}
		num2[3]=40;
		num2[4]=50;
		System.out.println("********************");
		for(int i=0;i<num2.length;i++) {
			System.out.println(num2[i]);
		}
	}

}
