package mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);

		WebElement signupBtn = driver.findElement(By.name("signup"));
		System.out.println("signupBtn is displayed: " + signupBtn.isDisplayed() + '\n' + "signupBtn is enabled: "
				+ signupBtn.isEnabled() + '\n' + "signupBtn is selected: " + signupBtn.isSelected());
		System.out.println("Inner text (Button Name) is: " + signupBtn.getText());

		System.out.println("id Attribute value is: " + signupBtn.getAttribute("id"));
		System.out.println("class Attribute value is: " + signupBtn.getAttribute("class"));
		System.out.println("name Attribute value is: " + signupBtn.getAttribute("name"));

		List<WebElement> btnname = driver.findElements(By.tagName("button"));
		System.out.println("Button count: " + btnname.size());
		for (int i = 0; i < btnname.size(); i++) {
			System.out.println(btnname.get(i).getAttribute("class"));

		}
		
		List<WebElement> labels = driver.findElements(By.tagName("label"));
		System.out.println("Label count: " + labels.size());
		
//		for(int j = 0; j < labels.size() ;j++) {
//			System.out.println(labels.get(j).getText());
//		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("link count: "+links.size());
//		for(int k=0;k<links.size();k++) {
//			System.out.println(links.get(k).getText());
//			
//		}
	}

}
