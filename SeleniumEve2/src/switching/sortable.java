package switching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.SeleniumUtils;

public class sortable extends SeleniumUtils {

	@Test
	public void testsort() throws InterruptedException {
		WebDriver driver = setUp("chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		driver.switchTo().frame(0);

		List<WebElement> items = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		Actions action = new Actions(driver);
		// action.dragAndDropBy(item1, 0, 255).build().perform();
		for (int i = 0; i < items.size(); i++) {

			action.dragAndDropBy(items.get(i), 0, 255).build().perform();
//			Thread.sleep(2000);
			
			
			
			
			
			
		}

	}
}
