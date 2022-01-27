package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlinktextofelement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://careers.foodpanda.com/");
		String Link= driver.findElement(By.linkText("Jobs")).getText();
		System.out.println("Link Text = " +Link);
	}
	}


