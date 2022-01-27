package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementusinglinktext {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://instagram.com/");
	    driver.findElement(By.linkText("//class['Forgot password']")).click();
	    
	}

}
