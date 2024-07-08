package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


public class Driver {

	public  WebDriver driver;
	//public  WebElement element;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void setDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\All drivers for selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.when2meet.com/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	//@AfterSuite
	/*public void close() {
		driver.close();
	}*/
	
}