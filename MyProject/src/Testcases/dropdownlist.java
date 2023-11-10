package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.ui.Select;

public class dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://Google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> scrolllist = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		
		System.out.println(scrolllist.size());
		for(WebElement element : scrolllist)
		{
			System.out.println(element.getText());
		}
		
		

	}

}
