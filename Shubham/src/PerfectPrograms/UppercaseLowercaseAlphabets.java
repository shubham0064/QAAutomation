package PerfectPrograms;

public class UppercaseLowercaseAlphabets {

	public static void main(String[] args) {

		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+",");
		}
		System.out.println();
		
		for(char ch='a';ch<='z';ch++) {
			System.out.print(ch+",");
		}
		System.out.println();
		
		//for reverse printing characterrs
		for(char ch='z';ch>='a';ch--) {
			System.out.print(ch+",");
		}
	}

}
