package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toeneterelementsininstagram {
  public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.instagram.com/");
  Thread.sleep(200);
    driver.findElement(By.cssSelector("input[name='username']")).sendKeys("bhavyasree");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("12345");
 
    
}	


}
