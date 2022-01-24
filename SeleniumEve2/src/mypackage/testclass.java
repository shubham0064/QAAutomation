package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testclass {

	public class TestNGClass {
		   private WebDriver driver;
		   private String URL = "http://www.calculator.net";

		  
		   public void launchapp(String browser) {

		      if (browser.equalsIgnoreCase("firefox")) {
		         System.out.println(" Executing on FireFox");
		         driver = new FirefoxDriver();
		         
		      } else if (browser.equalsIgnoreCase("chrome")) {
		         System.out.println(" Executing on CHROME");
		 
		         System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		         driver = new ChromeDriver();
		        
		      } else if (browser.equalsIgnoreCase("ie")) {
		         System.out.println("Executing on IE");
		         System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		         driver = new InternetExplorerDriver();
		         
		      } else {
		         throw new IllegalArgumentException("The Browser Type is Undefined");
		      }
		   }
	}
}