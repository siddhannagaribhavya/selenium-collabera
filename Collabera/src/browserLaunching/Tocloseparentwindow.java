package browserLaunching;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tocloseparentwindow {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://naukri.com/");
    driver.close();
    String parentwindowid=driver.getWindowHandle();
    Set<String>allwidowIds=driver.getWindowHandles();
    allwidowIds.remove(parentwindowid);
    
    for(String Windowid:allwidowIds)
    {
	driver.switchTo().window(Windowid);
	driver.close();
	}    

	}

}
