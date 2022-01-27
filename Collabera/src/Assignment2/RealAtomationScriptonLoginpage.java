package Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.util.security.Password;

public class RealAtomationScriptonLoginpage {

	public static void main(String[] args) throws InterruptedException 
	{
		//test data
		String testUrl="https://demo.actitime.com/login.do";
		String username="admin";
		String password="manager";
		String expectedLoginpageTitle="actitime-login";
		String expectedHomePageTitle="actitime-enter time_track";
		
		//step1:open the browser enter the url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     System.out.println("Browser launched successfully");
	     driver.manage().window().maximize();
	     System.out.println("Browser is maximized successfully");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      WebDriverWait explicitWait=new WebDriverWait(driver,10);
	      driver.get(testUrl);
	      String  actualloginpagetitle=driver.getTitle();
	      if(actualloginpagetitle.equals(expectedLoginpageTitle))
	      {
	    	  System.out.println("login page is displayed successfully");
	      }
	      else
	      {
	    	  System.out.println("login page is displayed successfully");
	      }
	      
	      
	      //step2;Enter Username In Username Textfield
	      WebElement usernameTextField=driver.findElement(By.name("username"));
	      usernameTextField.clear();
	      usernameTextField.sendKeys(username);
	      String  actualusernameEntered=usernameTextField.getAttribute("value");
	      if(actualusernameEntered.equals(username))
	      {
	    	  System.out.println("username is displayed successfully");
	      }
	      else
	      {
	    	  System.out.println("username is not displayed successfully");
	      }
	      
	     //step3:enter password in passwordtextfield
	      
	      WebElement passwordTextField=driver.findElement(By.name("pwd"));
	      passwordTextField.clear();
	      passwordTextField.sendKeys(password);
	      String  actualpasswordEntered=passwordTextField.getAttribute("value");
	      if(actualpasswordEntered.equals(password))
	      {
	    	  System.out.println("password is entered successfully");
	      }
	      else
	      {
	    	  System.out.println("password is not  entered successfully");
	      }
	      //step4: click on login button
	      driver.findElement(By.id("loginButton")).click();
	      explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
	      String  actualhomepagetitle1=driver.getTitle();
	      if(actualhomepagetitle1.equals(expectedHomePageTitle))
	      {
	    	  System.out.println("home page is displayed successfully");
	      }
	      else
	      {
	    	  System.out.println("home page is displayed successfully");
	      }
	}
}
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	    

