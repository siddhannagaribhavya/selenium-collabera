package SelectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

     public class ToHandleDropDown3 {
	 public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
			driver.get("file:///C:/Users/SAINATH/Downloads/dropDown.html");
			//multiselect dropDown
             WebElement multiselectdropdown=driver.findElement(By.id("m1"));
             Select select=new Select(multiselectdropdown);
             //select by index
	         select.selectByIndex(2);
	         select.selectByIndex(1);
	         //select by value
	         select.selectByValue("4");
	         //select by visibletext
	         select.selectByVisibleText("Guava");
	         //deselect
	         //select.deselectByIndex(2);
	        String a =select.getFirstSelectedOption().getText();
	        System.out.println(a);
	    
	         //deselectall
	         select.deselectAll();
	}

}
