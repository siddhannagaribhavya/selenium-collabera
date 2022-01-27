package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    WebElement usernametextfield=driver.findElement(By.name("username"));
	    usernametextfield.sendKeys("trainee");
	    Thread.sleep(3000);
	    driver.findElement(By.name("pwd")).sendKeys("trainee");
	    Thread.sleep(3000);
	    driver.findElement(By.id("loginButton")).click();
	    	


	}

}
