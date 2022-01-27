package String;

public class StringClass2 {

	public static void main(String[] args) {
		
// to print 1 by 1 character of string
		String str = "Dhanori pune";
		String temp = "";
		
//		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
//		for(int i=str.length()-1;i>=0;i--) {
//			temp=temp+str.charAt(i);
//		}
//		System.out.println("temp: "+temp);
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println("___________");
		String s1="Bangalore";
		System.out.println(reverseString(s1));
		
		
		
	}
	static String reverseString(String str) {
		return str;
		
	}

}
