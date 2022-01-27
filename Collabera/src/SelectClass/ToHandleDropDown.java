package SelectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/SAINATH/Downloads/dropDown.html");
		WebElement dayListbox=driver.findElement(By.id("m1"));
		Select select=new Select(dayListbox);
		System.out.println(select.isMultiple());
		select.selectByIndex(0);
		select.selectByValue("2");
		select.selectByVisibleText("Orange");
		
		
	}

}
