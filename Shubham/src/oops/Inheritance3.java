package oops;

class fourwheeler {
	// default constructor
	public void wheels() {
		System.out.println("4 wheels");
	}
}

//child class of fourwheeler and parent of maruti
class car extends fourwheeler {
	// default constructor with default super()
	public void type() {
		System.out.println("Im a car");
	}
}

//child class of car class
class maruti extends car {
	// default constructor with default super()
	public void company() {
		System.out.println("Im maruti");
	}
}

public class Inheritance3 {
	public static void main(String args[]) {
		maruti m = new maruti();// object of child class
		m.wheels();
		m.type();
		m.company();
	}
}
