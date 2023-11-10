package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class facebooklinksanddropdownlist {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		WebElement element = driver.findElement(By.id("searchDropdownBox"));
		Thread.sleep(2000);
		Select catlist = new Select(element);
		
		List<WebElement> cat = catlist.getOptions();
		int itemcount = cat.size();
		System.out.println(cat.size());
		
		for(WebElement e : cat)
		{
			System.out.println(e.getText());
			
		}
				
		
		
	}

}
