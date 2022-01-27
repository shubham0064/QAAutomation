package String;

public class StringClass1 {

	public static void main(String[] args) {

		StringClass1 c1 = new StringClass1();
		System.out.println("c1: "+c1);
	//	System.out.println("c1: "+c1.toString());
		String s1 = "Mumbai";
		String s2 = "Mumbai";
		String s3 = "Pune";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		System.out.println(s1.startsWith("Mum"));
		System.out.println(s1.endsWith("bai"));
		System.out.println(s1.contains("umb"));
		System.out.println("_______");
		
		System.out.println(s1.equals(s2));//based on value
		System.out.println(s1==s2);
		System.out.println("<<<<<<<");
		
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		
		String s4 = new String("Mumbai");
		System.out.println("_____");
		
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
		System.out.println("____");
		
		String s5 = new String("Mumbai");
		System.out.println(s4.equals(s5));
		System.out.println(s1==s5);
	}
}