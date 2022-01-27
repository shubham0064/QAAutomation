package Interface;

interface Bank {
	float rateofinterest();
}

class SBI implements Bank {
	public float rateofinterest() {
		System.out.println("SBI rate of interest");
		return 9.70f;
	}
}

class PNB implements Bank {
	public float rateofinterest() {
		System.out.println("PNB rate of interest");
		return 8.66f;
	}
}

class Interface2 {
	public static void main(String args[]) {
		SBI s = new SBI();
		System.out.println(s.rateofinterest());
		PNB p = new PNB();
		System.out.println(p.rateofinterest());

		// or
		Bank b = new SBI();
		System.out.println(b.rateofinterest());
	}
}
