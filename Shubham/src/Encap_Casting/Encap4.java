package Encap_Casting;

public class Encap4 {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setacc_no(16033);
		acc.setname("shubh");
		acc.setemail("shubhamunde3010@gmail.com");
		acc.setamount(25000);
		System.out.println(acc.getacc_no());
		System.out.println(acc.getname());
		System.out.println(acc.getemail());
		System.out.println(acc.getamount());
	}

}
