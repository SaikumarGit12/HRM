package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://Facebook.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		String pgtitle = driver.getTitle();
		if(pgtitle.contains("Forgotten"))
		{
			System.out.println("Test Pass");
			
		}else
		{
			System.out.println("Test Fail");
		}
		

	}

}
