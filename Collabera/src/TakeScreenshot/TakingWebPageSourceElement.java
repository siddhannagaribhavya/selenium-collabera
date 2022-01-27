package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakingWebPageSourceElement {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	          ChromeDriver driver=new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        
	          driver.get("https://www.zomato.com/");
	          File tempfile= driver.getScreenshotAs(OutputType.FILE);
		         System.out.println(tempfile);
		         //we have to create a errorshot folder in project
		         File destfile=new File("./errorshots/scrnshot1.png");//./update the page 
		         //to replace the screenshot
		         FileUtils.copyFile(tempfile,destfile);
	}

}
