package Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException 
	{
		      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	          ChromeDriver driver=new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	          Thread.sleep(2000);
	          
	          
	          driver.get("https://www.flipkart.com/");
	          String parentWinId=driver.getWindowHandle();
	          driver.findElement(By.name("q")).sendKeys("POCO C31 (Royal Blue, 32 GB)",Keys.ENTER);
	          driver.findElement(By.xpath("//div[@data-id])[3]")).click();
	}

}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	

}
