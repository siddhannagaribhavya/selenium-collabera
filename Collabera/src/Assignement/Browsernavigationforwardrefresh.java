package Assignement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browsernavigationforwardrefresh {
	 public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
		    driver.navigate().to("https://www.facebook.com/");
		    Thread.sleep(2000);
		    driver.navigate().to("https://www.google.com/");
		    driver.navigate().back();
		    Thread.sleep(2000);
		    driver.navigate().forward();
		    Thread.sleep(2000);
		    driver.navigate().refresh();
		    Thread.sleep(2000);
	 }
}
		    
        
