package WebElementmethods;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardactions {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement usernametextfield=driver.findElement(By.id("username"));
	    usernametextfield.clear();

	    usernametextfield.sendKeys("bh","a","vy","a",Keys.CONTROL+"a");
	  Thread.sleep(2000);
	  usernametextfield.sendKeys(Keys.CONTROL+"c");
	  
	  usernametextfield.sendKeys(Keys.CONTROL+"V");
	  Thread.sleep(3000);
	  /*WebElement passwordtextfield=driver.findElement(By.name("password"));
	    passwordtextfield.clear();

	 
	  Thread.sleep(2000);
	  passwordtextfield.sendKeys(Keys.CONTROL+"V");*/
	  
	  
	  
	  
	}

}
