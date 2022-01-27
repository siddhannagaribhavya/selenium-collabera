package SelectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDownsingleselect {

	 public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
			driver.get("file:///C:/Users/SAINATH/Downloads/dropDown.html");
         WebElement singleselectdropdown=driver.findElement(By.id("s1"));
          Select select=new Select(singleselectdropdown);
         select.selectByIndex(3);
         Thread.sleep(2000);
         select.selectByValue("1");
         Thread.sleep(2000);
         select.selectByVisibleText("Appium");
          
	}

}
