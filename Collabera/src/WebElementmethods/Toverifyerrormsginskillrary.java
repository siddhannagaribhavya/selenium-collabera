package WebElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toverifyerrormsginskillrary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://skillrary.com/");
	    driver.findElement(By.xpath("//button[contains(text(),'Submit']")).click();
	    String Expectedtitle="email field is requird";
	    WebElement errormsgelement=driver.findElement(By.id("email-error"));
	   
	      String actualerrormsg=errormsgelement.getText();
	      System.out.println(actualerrormsg);
	      
	      
	      if(Expectedtitle.equals(actualerrormsg)) {
	    	 System.out.println("proper error msg is displayed");
	      }
	      else {
	    	  System.out.println("invalid error msg");
	      }
	}
	      }
	  
