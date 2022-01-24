package mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OmayoBlogspot {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//single dropdown starts
		WebElement singledropdown = driver.findElement(By.id("drop1"));
		Select selectdropdown = new Select(singledropdown);
		
		System.out.println("Is dropdown multiselect: "+selectdropdown.isMultiple());
		System.out.println("First option is: "+selectdropdown.getFirstSelectedOption().getText());
		
		List<WebElement> options = selectdropdown.getOptions();
		System.out.println("Options count: "+options.size());
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		selectdropdown.selectByIndex(0);
		Thread.sleep(2000);
		System.out.println("option 1: "+selectdropdown.getFirstSelectedOption().getText());
		
		selectdropdown.selectByValue("def");
		Thread.sleep(2000);
		System.out.println("option 2: "+selectdropdown.getFirstSelectedOption().getText());
		
		selectdropdown.selectByVisibleText("doc 2");
		Thread.sleep(2000);
		System.out.println("option 3: "+selectdropdown.getFirstSelectedOption().getText());
		
		selectdropdown.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println("option 3: "+selectdropdown.getFirstSelectedOption().getText());
		
		selectdropdown.selectByIndex(4);
		Thread.sleep(2000);
		System.out.println("option 4: "+selectdropdown.getFirstSelectedOption().getText());
		
		System.out.println("___________________________________________________________");
		//multiple dropdown starts
		
		WebElement multidropdown = driver.findElement(By.id("multiselect1"));
		Select selectMulti = new Select(multidropdown);
		System.out.println("Is DropDown Multislect: "+selectMulti.isMultiple());
		
		for(int j=0;j<selectMulti.getOptions().size();j++) {
			System.out.println(selectMulti.getOptions().get(j).getText());
		}
		selectMulti.selectByIndex(0);
		selectMulti.selectByValue("swiftx");
		selectMulti.selectByVisibleText("Hyundai");
		selectMulti.selectByIndex(3);
		System.out.println("Selected option size: "+selectMulti.getAllSelectedOptions().size());
		
		for(int k=0;k<selectMulti.getAllSelectedOptions().size();k++) {
			System.out.println("Printing selected options: "+selectMulti.getAllSelectedOptions().get(k).getText());
		}
		Thread.sleep(2000);
		selectMulti.deselectAll();
	}

}
