package WebElementmethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickusingsubmitmethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement arg=((Object) driver).findelement();
		//String expectedtitle="Please identify yourself";
		//String actualtitle=driver.getTitle();
		//if(expectedtitle==actualtitle) 
		{
			
			
		}
		
	}
}
