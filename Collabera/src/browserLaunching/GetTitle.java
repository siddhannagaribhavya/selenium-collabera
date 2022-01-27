package browserLaunching;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

     public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://zomato.com/");
        String gt=driver.getTitle();
        System.out.println(gt);
	}

}
