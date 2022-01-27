package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTrello {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("sreebhavya456@gmail.com");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Bhavya@771998");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("Bhavya@771998");
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.xpath("//div[text()='bhavya']")).click();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		WebElement srcelement=driver.findElement(By.xpath("//h2[text()='manual']/../..//span[text()='sdlc']"));
		WebElement dstelement=driver.findElement(By.xpath("//h2[text()='Done']/../..//span[text()='selenium']"));
		action.dragAndDrop(srcelement,dstelement).perform();
	}

}
