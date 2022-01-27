package browserLaunching;
import java.awt.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class Togetheightandwidthofbrowser {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://skillrary.com/");
    Thread.sleep(3000);
     org.openqa.selenium.Dimension dimension=driver.manage().window().getSize();
      int height= (int) dimension.getHeight();
      int width= (int) dimension.getWidth();
  System.out.println(height);
  System.out.println(width);
}


}
