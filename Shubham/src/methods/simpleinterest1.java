package methods;

public class simpleinterest1 
{

	static double getInterest(int principle,double roi,int time)
	{
	
		System.out.println("Enter the principle: "+principle);
		System.out.println("Enter the rate of interest: "+roi);
		System.out.println("Time in duration: "+time);
		double interest=(principle*roi*time)/100;
		System.out.println("Simple interest is : "+interest);
        return interest;
	}
        
        public static void main(String[] arg)
        {
  		  getInterest(2000, 6, 3);
  		  System.out.println("__________________________________________");
  		  
  		  getInterest(1000, 6, 3);
        System.out.println("______________________________________________");
        
  		   int x=1500,z= 3;
  		  double y=6;
  		  
  		  getInterest(x, y, z);
  		  System.out.println("__________________________________________");
  		  
  		 double total=(getInterest(1500, 6, 3)+1500);
  		 System.out.println("Total is : "+total);
  		 
  		  }
  		  
	
}
