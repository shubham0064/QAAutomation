package screenshot;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import resuables.Utils;

public class ScreenshotWithMethod {

	public static void main(String[] args) throws IOException  {
		Utils.setup("chrome", "https://www.flipkart.com/");

//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File file=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file,new File("./screenshots/GoogleSearchPage.jpg"));
		Utils.getScreenShot("./screenshots/Page111.jpg");
	}

}
