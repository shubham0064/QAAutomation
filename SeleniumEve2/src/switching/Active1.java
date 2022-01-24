package switching;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.SeleniumUtils;


public class Active1 extends SeleniumUtils{

	@Test
	public void testElements() {
		WebDriver driver = setUp("chrome","https://demo.actitime.com/login.do");
		WebElement element = driver.switchTo().activeElement();
		String value = element.getAttribute("placeholder");
		Assert.assertEquals(value, "Username","value doesn't match");
		element.sendKeys("admin",Keys.TAB);
		WebElement element2 = driver.switchTo().activeElement();
		element2.sendKeys("manager",Keys.ENTER);
		driver.close();
	}
	@Test
	public void testGoogleSearch() {
		WebDriver driver = setUp("chrome","http://www.google.com");
		driver.switchTo().activeElement().sendKeys("selenium testing",Keys.ENTER);
	}

	
	
	
	
}
