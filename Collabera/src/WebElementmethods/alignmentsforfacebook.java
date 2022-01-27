package WebElementmethods;

import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alignmentsforfacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    org.openqa.selenium.Rectangle rectangle=driver.findElement(By.id("email")).getRect();
	    
	    int email_height=rectangle.getHeight();
	    int email_width=rectangle.getWidth();
	    int email_X_axis=rectangle.getX();
	    int email_Y_axis=rectangle.getY();

	System.out.println(email_height);
	System.out.println(email_width);
	System.out.println(email_X_axis);
	System.out.println(email_Y_axis);



	
	org.openqa.selenium.Rectangle rect=driver.findElement(By.id("pass")).getRect();
	
	
	int password_height=rectangle.getHeight();
	
    int password_width=rectangle.getWidth();
    int password_X_axis=rectangle.getX();
    int password_Y_axis=rectangle.getY();

System.out.println(password_height);
System.out.println(password_width);
System.out.println(password_X_axis);
System.out.println(password_Y_axis);

	}
}








