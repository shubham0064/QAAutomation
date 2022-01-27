package Encap_Casting;

class Sample1{

	double test1() {
		return 4;
	}
}
public class PrimitiveCasting6 {

	public static void main(String[] args) {
		Sample1 s = new Sample1();
		
		int ratevalue = (int)s.test1();
		System.out.println(ratevalue);
	}

}
