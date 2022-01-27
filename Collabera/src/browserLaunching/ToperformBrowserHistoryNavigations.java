package browserLaunching;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToperformBrowserHistoryNavigations {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 driver.get("https://zomato.com/");
	  Thread.sleep(3000);
	  driver.get("https://skillrary.com/");
      Thread.sleep(3000);
	 driver.navigate().back();
	 Thread.sleep(3000);
	 driver.navigate().forward();
	 Thread.sleep(3000);
	driver.navigate().refresh();
	URL url=new URL("https://swiggy.com/");
	driver.navigate().to("https://swiggy.com/");
	
	 
	 
	 

}
}