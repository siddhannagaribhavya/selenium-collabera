package Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	          ChromeDriver driver=new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	          Thread.sleep(2000);
	          driver.get("https://www.amazon.com/");
	          driver.findElement(By.xpath(""))
	}

}
