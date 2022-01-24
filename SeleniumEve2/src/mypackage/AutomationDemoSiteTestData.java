package mypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoSiteTestData {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream(".\\testdata\\AutomationDemoSite.properties");
		Properties prop = new Properties();
		prop.load(fis);

		System.setProperty(prop.getProperty("chromedriverkey"), prop.getProperty("chromedrivervalue"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.cssSelector("div[class='col-md-8 col-xs-8 col-sm-8']>textarea")).sendKeys(prop.getProperty("address"));
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys(prop.getProperty("phone"));
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		driver.findElement(By.cssSelector("input[id='checkbox1']")).click();
		driver.findElement(By.cssSelector("input[id='checkbox2']")).click();
		driver.findElement(By.cssSelector("input[id='checkbox3']")).click();
		Thread.sleep(2000);
		
	//	driver.findElement(By.id("msdd")).click();
		List<WebElement> language = driver.findElements(By.cssSelector("div[class='col-md-4 col-xs-4 col-sm-4']>multi-select>div:last-child>ul>li>a"));
		System.out.println("count of language: "+language.size());
		
		
		
//		WebElement dropdown1 = driver.findElement(By.cssSelector("select[id='Skills']"));
//		Select selectdrop1 = new Select(dropdown1);
//		List<WebElement> options1 = selectdrop1.getOptions();
//		System.out.println("Skills Options count: "+options1.size());
//		selectdrop1.selectByValue("Java");
//		
////		WebElement dropdownaaa = driver.findElement(By.cssSelector("select[id='countries'][type='text']>option"));
////		Select selectdropaaa = new Select(dropdownaaa);
////		List<WebElement> optionsaaa = selectdropaaa.getOptions();
////		System.out.println("Years Options count: "+optionsaaa.size());
////		selectdropaaa.selectByIndex(0);
//		
//		WebElement dropdown2 = driver.findElement(By.className("select2-hidden-accessible"));
//		Select selectdrop2 = new Select(dropdown2);
//		List<WebElement> options2 = selectdrop2.getOptions();
//		System.out.println("Country Options count: "+options2.size());
//		selectdrop2.selectByIndex(5);
//		
//		WebElement dropdown3 = driver.findElement(By.id("yearbox"));
//		Select selectdrop3 = new Select(dropdown3);
//		List<WebElement> options3 = selectdrop3.getOptions();
//		
//		System.out.println("Years Options count: "+options3.size());
//		selectdrop3.selectByValue("1995");
//		
//		WebElement dropdown4 = driver.findElement(By.cssSelector("select[type='text'][ng-model='monthbox']"));
//		Select selectdrop4 = new Select(dropdown4);
//		List<WebElement> options4 = selectdrop4.getOptions();
//		System.out.println("Month Options count: "+options4.size());
//		selectdrop4.selectByVisibleText("October");
//		
//		WebElement dropdown5 = driver.findElement(By.id("daybox"));
//		Select selectdrop5 = new Select(dropdown5);
//		List<WebElement> options5 = selectdrop5.getOptions();
//		System.out.println("Days Options count: "+options5.size());
//		selectdrop5.selectByIndex(30);
//		
//		driver.findElement(By.cssSelector("input[id='firstpassword'][ng-model='Password']")).sendKeys(prop.getProperty("pass"));
//		driver.findElement(By.cssSelector("input[id='secondpassword'][ng-model='CPassword']")).sendKeys(prop.getProperty("cpass"));
//		driver.findElement(By.cssSelector("button[id='submitbtn']")).click();
	}

}
