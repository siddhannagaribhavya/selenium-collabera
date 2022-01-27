package WebElementmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingExplicitly {


	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().explicitWait(10,TimeUnit.SECONDS);
	    WebDriverWait  explicitwait=new WebDriverWait(driver,10);
	    driver.get("https://www.instagram.com/");
	    explicitwait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
	    driver.findElement(By.name("username")).sendKeys("bhavya");
	    
	}

}
