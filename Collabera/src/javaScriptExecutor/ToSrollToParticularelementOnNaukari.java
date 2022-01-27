package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

       public class ToSrollToParticularelementOnNaukari {
	   public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.naukri.com/");
		WebElement elementscroll=driver.findElement(By.partialLinkText("View all companies"));
		
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
	    js.ExecuteScript(By.xpath("//a[text()='View all companies']))[2]"));
		
	}

}
