package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickonspecificwindowtitle {


		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://uber.com/");
	        driver.findElement(By.xpath("//h2['Order delivery with Uber Eat']"));
	}

}
