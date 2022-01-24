package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.SeleniumUtils;

public class HandlingAlerts1 extends SeleniumUtils {

	static WebDriver driver;

	@Test
	public void testAlerts() throws InterruptedException {
		 driver = setUp("chrome", "https://demoqa.com/alerts");

//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(2000);
//		String alertText = driver.switchTo().alert().getText();
//		System.out.println("see text: "+alertText);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		driver.switchTo().defaultContent();
//		
//		driver.findElement(By.id("confirmButton")).click();
//		String alertText2 = driver.switchTo().alert().getText();
//		System.out.println("confirm text: "+alertText2);
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().defaultContent();
//		
//		driver.findElement(By.id("promtButton")).click();
//		String promptAlert = driver.switchTo().alert().getText();
//		System.out.println("prompt text: "+promptAlert);
//		driver.switchTo().alert().sendKeys("Testing");
//		driver.switchTo().alert().accept();
//		driver.switchTo().defaultContent();
		handleAlertPopup("accept");
		Thread.sleep(2000);
		handleConfirmPopup("dismiss");
		Thread.sleep(2000);
		handlePromptPopup("accept");
	}

	void handleAlertPopup(String popupaction) {
		driver.findElement(By.id("alertButton")).click();
		System.out.println("Alert Text: " + driver.switchTo().alert().getText());
		// driver.switchTo().alert().accept();
		if (popupaction.equals("accept")) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}
	}

	void handleConfirmPopup(String popupaction) {
		driver.findElement(By.id("confirmButton")).click();
		System.out.println("Confirm text: "+driver.switchTo().alert().getText());
		if(popupaction.equals("dismiss")) {
			driver.switchTo().alert().dismiss();
		}else {
			driver.switchTo().alert().accept();
		}
	}
	
	void handlePromptPopup(String popupaction) {
		driver.findElement(By.id("promtButton")).click();
		System.out.println("Prompt Text: "+driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Testing");
		if(popupaction.equals("accept")) {
			driver.switchTo().alert().accept();
		}else {
			driver.switchTo().alert().dismiss();
		}
	}
}
