package StringInterview;

public class ReverseStringRecursion {

	public static String reverse(String str) {
		if(str.length()<=1) {
			return str;
		}else {
			return reverse(str.substring(1))+str.charAt(0);
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println(reverse("Hello"));
	}

}
/*       ello h
          llo eh
           lo 1eh
            o lleh
            - olleh
*/