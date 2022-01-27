package Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationscriptforReddiff {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//username entered
		WebElement usernametextfield=driver.findElement(By.id("login1"));
		usernametextfield.sendKeys("sumanthElfBatch@rediffmail.com");
		
		//password enterd
		WebElement passwordtextfield=driver.findElement(By.id("password"));
		passwordtextfield.sendKeys("Testing@123");
		
		//signin
		driver.findElement(By.className("signinbtn")).click();
		
		
		//writemail
		driver.findElement(By.linkText("Write mail")).click();
		
		//to mail
		WebElement emailtextfield=driver.findElement(By.id("TO_IDcmp2"));
		emailtextfield.sendKeys("sumanthElfBatch@rediffmail.com");
		
		//subject
		WebElement subjecttextfield=driver.findElement(By.xpath("//input[contains(@class,'subject')]"));
		subjecttextfield.sendKeys("Bhavya");
		
		
		//inbox
		WebElement frame=driver.findelement(//iframe[contains(@title,'Rich Text Editor, rdMailEditorcmp2')]);
		
		
		
		
		
	}

}
