package Assignement;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinates {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.naukri.com/");
	    driver.manage().window().setPosition(new Point(100,50));
	    
}
	
}
