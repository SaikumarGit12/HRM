package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		List<WebElement> plcelist = driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[1]/div/div[1]/div/div[1]/ul")).findElements(By.tagName("li"));
		
		System.out.println(plcelist.size());
		for(WebElement elemnet : plcelist)
		{
			System.out.println(elemnet.getText());
		}
		 driver.findElement(By.id("dest")).sendKeys("Banglore");
		 Thread.sleep(2000);
		 
		
		List<WebElement> destlist = (List<WebElement>) driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[1]/div/div[3]/div[1]/ul")).findElement(By.tagName("li"));
		 System.out.println(destlist.size());
		 for(WebElement element : destlist)
		 {
			 System.out.println(element.getText());
		 }
		

	}

}
