package Assignement;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resizethewindow {
	 public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.naukri.com/");
		   // driver.manage().window().setSize(new Dimension(100,200));
	 }
		    
}
