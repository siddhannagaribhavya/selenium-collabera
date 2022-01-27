package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveYourCursor {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.myntra.com/");
		WebElement beautyElement=driver.findElement(By.linkText("BEAUTY"));
		
    //actions class
	Actions actions=new Actions(driver);
	actions.moveToElement(beautyElement).perform();//under beauty we have to choose perfume
	driver.findElement(By.linkText("Perfume")).click();
	}
	
	

}
