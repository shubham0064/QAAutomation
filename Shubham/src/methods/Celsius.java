package methods;

public class Celsius {
static double fahrenheit=25;
	public static void main(String[] args) {
	
		float fahrenheit, celsius;
		fahrenheit = 43;
		celsius = ((fahrenheit-32)*5)/9;
		
		System.out.println("Temperature in celsius is: "+celsius);
		System.out.println("Now temperature will be: "+Celsius.updated);
		
	}
	
	public static double updated(double fahrenheit ) {
		return (((fahrenheit-32)*5)/9);
	}
	
	
	}


