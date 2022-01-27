package Abstract;

abstract class RBIBANK{
	abstract double getRateOfInterestForHomeLoan();
	void loan() {
		System.out.println("as per rbi loan");
	}
}
class SBI extends RBIBANK{
	double getRateOfInterestForHomeLoan() {
		return 7.5;
	}
}
class PNB extends RBIBANK{
	double getRateOfInterestForHomeLoan() {
		return 10.75;
	}
}
public class abstractClass3 {
	public static void main(String args []) {
		PNB p = new PNB();
		System.out.println(p.getRateOfInterestForHomeLoan());
		SBI q = new SBI();
		System.out.println(p.getRateOfInterestForHomeLoan());
		
		RBIBANK r = new SBI();
		System.out.println(r.getRateOfInterestForHomeLoan());
		
		RBIBANK s = new PNB();
		System.out.println(r.getRateOfInterestForHomeLoan());
	}

}
