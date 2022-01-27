package browserLaunching;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPagesource {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	  driver.get("https://zomato.com/");
	  String ps=driver.getPageSource();
	  System.out.println(ps);

	}

}
