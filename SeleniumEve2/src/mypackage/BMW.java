package mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BMW {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		//single dropdown starts
		WebElement singledropdown = driver.findElement(By.id("carselect"));
		Select selectsingle = new Select(singledropdown);
		
		System.out.println("Is dropdown multiselect: "+selectsingle.isMultiple());
		System.out.println("Print first option: "+selectsingle.getFirstSelectedOption().getText());
		
		List<WebElement> options = selectsingle.getOptions();
		System.out.println("Options size: "+options.size());
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		selectsingle.selectByIndex(0);
		Thread.sleep(2000);
		System.out.println("first option is: "+selectsingle.getFirstSelectedOption().getText());
		selectsingle.selectByValue("benz");
		Thread.sleep(2000);
		System.out.println("second option is: "+selectsingle.getFirstSelectedOption().getText());
		selectsingle.selectByVisibleText("Honda");
		Thread.sleep(2000);
		System.out.println("third option is: "+selectsingle.getFirstSelectedOption().getText());
		
		//multi dropdown
		System.out.println("____________________________________________________________");
		
		WebElement multidropdown = driver.findElement(By.id("multiple-select-example"));
		Select selectmulti = new Select(multidropdown);
		
		System.out.println("Is dropdown multiselect: "+selectmulti.isMultiple());

	//	System.out.println("First option is: "+selectmulti.getFirstSelectedOption().getText());
		
		for(int j=0;j<selectmulti.getOptions().size();j++) {
			System.out.println(selectmulti.getOptions().get(j).getText());
		}
		selectmulti.selectByIndex(0);
		Thread.sleep(2000);
		selectmulti.selectByValue("orange");
		Thread.sleep(2000);
		selectmulti.selectByVisibleText("Peach");
		Thread.sleep(2000);
		System.out.println("Selected options count is: "+selectmulti.getAllSelectedOptions().size());
		for(int k=0;k<selectmulti.getOptions().size();k++) {
			System.out.println(selectmulti.getAllSelectedOptions().get(k).getText());
		}
		//Thread.sleep(2000);
		selectmulti.deselectAll();
		//Thread.sleep(2000);
		
		
		
	}

}
