package WebElementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class AutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    
	    
	    driver.findElement(By.name("q")).click();
	    List<WebElement> listofSuggestions=driver.findElements(By.xpath("//li[@role=\'presentation\']"));
	    List<WebElement> dataforSuggestions=driver.findElements(By.xpath("//li[@role=\'presentation\']"));
	    		System.out.println("the number of autosuggestions :"+ listofSuggestions.size());
	    		
	    		
	    		 for(WebElement ele:dataforSuggestions) {
	    		 System.out.println(ele.getText());
	    		 }
	}
}
	    		 
	    
