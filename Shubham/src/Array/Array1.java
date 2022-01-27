package Array;

public class Array1 {

	public static void main(String[] args) {
		
		int a[];  //declaration
		
		a = new int[5]; //size initialization
		
//		int a[]=new int[5];//declaration and instantiation  
		System.out.println("__Array element without initilization____");
		System.out.println(a[0]);  
		System.out.println(a[1]);  
		System.out.println(a[2]);  
		System.out.println(a[3]);  
		a[4] = 44;
		System.out.println(a[4]); 
		System.out.println("Array element count: "+a.length);
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40; 
		
		System.out.println("_______");
		//traversing array  
				for(int i=0;i<a.length;i++)//length is the property of array  
				{
					System.out.println(a[i]);  
				}
				System.out.println("_______");
				//in for-each loop HLS always depends on RHS
				for(int num: a) {
					System.out.println(num);
				}
				//int[] getArray2 ={ 10, 30, 50, 90, 60 };
				//or 
		int[] getArray =new int[] { 10, 30, 50, 90, 60 };
		System.out.println("**************for-each loop----5*************");
		for(int num: getArray) {
			System.out.println(num);
		}
				
	}
	

}
