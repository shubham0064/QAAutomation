package Encap_Casting;

class Sample {

	void test1(double d) {
		System.out.println(d);
	}
	void test1(int i) {
		System.out.println(i);
	}
}
public class PrimitiveCasting5 {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.test1(25.5);
		s.test1(20.5);
	}

}
