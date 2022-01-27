package StringInterview;

public class ReverseString {

	public static void main(String[] args) {

       // using iteration
		
		String str = "Shrirampur";
		String rev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + rev);

		
		
////using character array
//		String str = "Shubham" , rev="";
//		
//		char s[] = str.toCharArray();
//		for(int i=str.length()-1;i>=0;i--) {
//			rev = rev + s[i];
//		}
//		System.out.println("Reversed string: "+rev);
//		
////using Stringbuffer class
//		String str = "Reverse";
//		StringBuffer  s = new StringBuffer(str);
//		System.out.println("Reversed string: "+s.reverse());

//	String str = "shubham";
//	for(int i=str.length()-1;i>=0;i--) {
//		System.out.print(str.charAt(i));//here if we try to print string with some statement then it mixes up so we use (rev variable to store )
//	}

	}

}
