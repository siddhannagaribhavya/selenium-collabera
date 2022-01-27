package ActionsClass;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToKeyUpandKeyDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.myntra.com/");
		List<WebElement> navbarelements=driver.findElements(By.xpath("//a[@data-type='navElements']"));
		Actions actions=new Actions(driver);
		
		for(WebElement ele: navbarelements)
		{
			actions.keyDown(Keys.SHIFT).click(ele).perform();
			actions.keyUp(Keys.SHIFT).perform();
		}
		
		
        Set<String> allwindowIds=driver.getWindowHandles();
        String ExpectedwindowTitle="Home and Living - Buy Interior Decoration Products and Accessories Online in India";
        
        
        
        
		for(String WindowId:allwindowIds)
		{
			driver.switchTo().window(WindowId);
			String Actualwindowtitle=driver.getTitle();
			if(ExpectedwindowTitle.equals(Actualwindowtitle))
			{
				driver.close();
			}
	}

	}
}

