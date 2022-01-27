package WebElementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraNAVbarElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://myntra.com/");
	    
	    
	    
	    List<WebElement>navEle=driver.findElements(By.xpath("//a[@data-type='navElements']"));
	    
	    
	    
	    for(WebElement ele:navEle)
	{
		System.out.println(ele.getText());
	}

}
}
