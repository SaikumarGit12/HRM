package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class facebookdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		
		
		
		WebElement dlist = driver.findElement(By.id("day"));
		 
		Select datelist = new Select(dlist);
		datelist.selectByVisibleText("13");
		
		WebElement monthlist = driver.findElement(By.id("month"));
		Select mlist = new Select(monthlist);
		mlist.selectByIndex(7);
		
		WebElement ylist = driver.findElement(By.id("year"));
		Select yearlist = new Select(ylist);
		yearlist.selectByValue("1998");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		
		
		
		
		
		
		
		 

	}

}
