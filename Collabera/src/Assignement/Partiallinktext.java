package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktext {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.naukri.com/");
	    driver.findElement(By.partialLinkText("['Best Places to Work']")).click();
	    
	}
}

