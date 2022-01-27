package Encap_Casting;

public class PrimitiveCasting2 {

	public static void main(String[] args) {
		
		//explicit widening
		int salary = 30000;
		double salaryDouble = (double)salary;
		float salaryfloat = (float)salary;
		System.out.println(salary+" "+salaryDouble+" "+salaryfloat);
		
		//implicit widening or auto widening
		double salarydouble2 = salary;
		float salaryfloat2 = salary;
		System.out.println(salary+" "+salaryDouble+" "+salaryfloat);
		
		//explicit narrowing
		double salarydb = 3000.25d;
		int salaryint = (int)salarydb;
		float salaryfloat1 = (float)salarydb;
		System.out.println(salarydb+" "+salaryint+" "+salaryfloat1);

		/*implicit narrowing not possible*/
		//int salaryInt2=salaryDb;
		//float salartFt2=salaryDb;
	}

}
