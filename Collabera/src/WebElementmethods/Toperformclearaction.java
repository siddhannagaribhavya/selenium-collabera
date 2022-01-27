package WebElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toperformclearaction {
	 public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.vtiger.com/vtigercrm/");
			Thread.sleep(200);
			
			
			driver.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("bhavya");
			
			
			driver.findElement(By.id("password")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("123");
			Thread.sleep(2000);
	 }

			
			
	}


