package browserLaunching;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tosetposition {
	public static void main(String[] args) {


	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://skillrary.com/");
    
   driver.manage().window().setPosition(new Point(100,60));
	}

}




 