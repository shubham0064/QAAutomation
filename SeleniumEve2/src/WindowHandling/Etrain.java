package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.SeleniumUtils;

public class Etrain extends SeleniumUtils {
	
	@Test
	public void train() throws InterruptedException {
	//	SeleniumUtils util = new SeleniumUtils();
		WebDriver driver = setUp("chrome", "https://etrain.info/in");
		Actions action = new Actions(driver);
		
		String HomeWinId = driver.getWindowHandle();
		System.out.println("Home window id: "+HomeWinId);
		driver.findElement(By.xpath("//a[text()='Reservation Rules']")).click();
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		
		Set<String> AllWinId = driver.getWindowHandles();
		System.out.println("All win ids: "+AllWinId);//2 Win IDs
		AllWinId.remove(HomeWinId);
		System.out.println("All win ids after removing homewinid: "+AllWinId);//1 winID
		
		String childWinId=AllWinId.iterator().next();
		System.out.println("child window id: "+childWinId);

		driver.switchTo().window(childWinId);
		WebElement service = driver.findElement(By.xpath("//a[text()='Services']"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(service));
		service.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,300)");
		
		WebElement sms = driver.findElement(By.xpath("//div[@class='panel-group']/div[1]/div[2]//ul/li[5]/a"));
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.elementToBeClickable(sms));
		sms.click();
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Close']")).click();
	//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'ads')]")));
		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='www.indianrail.gov.in']")).click();
//		
//		Set<String> AllWinId1 = driver.getWindowHandles();
//		System.out.println("All win ids: "+AllWinId1);
	}

}
