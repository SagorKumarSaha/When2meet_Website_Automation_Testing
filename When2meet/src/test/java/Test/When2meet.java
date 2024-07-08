package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class When2meet extends Driver{
	
	@SuppressWarnings("deprecation")
	@Test(priority=1, description = "Task-1 --> create event")
	public void create_event() throws InterruptedException {
		
		//event name
		driver.findElement(By.id("NewEventName")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("NewEventName")).sendKeys(Keys.chord(Keys.CONTROL,"a"), Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.findElement(By.id("NewEventName")).sendKeys("Test Event");
		Thread.sleep(1500);
		
		//date select
		driver.findElement(By.id("Day-1-7")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Day-2-1")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Day-2-2")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Day-2-3")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Day-2-4")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Day-2-5")).click();
		Thread.sleep(500);
		
		//select time (earlier)
		WebElement earlier_time = driver.findElement(By.name("NoEarlierThan"));
		Select sc = new Select(earlier_time);
		sc.selectByVisibleText("8:00 AM");
		Thread.sleep(1000);
		
		// select time (later)
		WebElement later_time = driver.findElement(By.name("NoLaterThan"));
		Select s = new Select(later_time);
		s.selectByVisibleText("6:00 PM");
		Thread.sleep(1000);
		
		//create event button
		driver.findElement(By.xpath("//*[@id=\"MainBody\"]/form/table/tbody/tr[3]/td/input")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		String e = driver.findElement(By.id("NewEventNameDiv")).getText();
		if(e.contains("Test Event")) {
			System.out.println(" Event Created... Test Passed...");
		}else {
			System.out.println("Test Failed...");
		}
		
		
	}
	
	@Test(priority=2, description = "Task-2 --> sign in")
	public void sign_in() throws InterruptedException {
		Thread.sleep(2000);
		
		//name field
		driver.findElement(By.id("name")).click();
		Thread.sleep(500);
		driver.findElement(By.id("name")).sendKeys("Sagor Saha");
		Thread.sleep(1000);
		
		//sign in button
		driver.findElement(By.cssSelector("input[value='Sign In']")).click();
		Thread.sleep(3000);
		
		
	}
	
	@Test(priority=3, description = "Task-3 --> mark availbility from 10 am to 11 am")
	public void mark_availability() throws InterruptedException {
		Thread.sleep(1000);
		
		//15 june
		driver.findElement(By.id("YouTime1718424000")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718424900")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718425800")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718426700")).click();
		Thread.sleep(500);
		
		//16 june
		driver.findElement(By.id("YouTime1718510400")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718511300")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718512200")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718513100")).click();
		Thread.sleep(500);
		
		//17 june
		driver.findElement(By.id("YouTime1718596800")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718597700")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718598600")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718599500")).click();
		Thread.sleep(500);
		
		//18 june
		driver.findElement(By.id("YouTime1718683200")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718684100")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718685000")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718685900")).click();
		Thread.sleep(500);
		
		//19 june
		driver.findElement(By.id("YouTime1718769600")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718770500")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718771400")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718772300")).click();
		Thread.sleep(500);
		
		//20 june
		driver.findElement(By.id("YouTime1718856000")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718856900")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718857800")).click();
		Thread.sleep(500);
		driver.findElement(By.id("YouTime1718858700")).click();
		Thread.sleep(500);
			
	}

}
