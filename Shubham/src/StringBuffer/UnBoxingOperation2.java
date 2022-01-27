package StringBuffer;

public class UnBoxingOperation2 {

	public static void main(String[] args) {

		// Double d=new Double(25.2566);// explicit boxing

		Double d = 25.66;// implicit boxing ,done by JVM
		System.out.println("Double object: " + d);

		double salary = d.doubleValue();// unboxing operation(storing value to data type from object)
										// for unboxing we need--> .doubleValue() method or .datatype.Value

		System.out.println(salary);

		System.out.println(d == salary);

		Integer obj = new Integer(5);
		System.out.println(obj);

		int num = obj.intValue();
		System.out.println(num);
	}

}
