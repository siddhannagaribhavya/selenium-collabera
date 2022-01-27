package browserLaunching;

import org.openqa.selenium.chrome.ChromeDriver;
public class Tomakebrowserfullscreenmode {

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
  driver.get("https://zomato.com/");
    Thread.sleep(3000);
  driver.manage().window().fullscreen();
  

}

}
