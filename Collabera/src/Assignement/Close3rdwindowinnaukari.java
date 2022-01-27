package Assignement;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close3rdwindowinnaukari {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com/");
		
		String WindowId = driver.getWindowHandle();

		Set<String> AllWindowId = driver.getWindowHandles();
		AllWindowId.remove(WindowId);

		String expectedUrl="https://company.naukri.com/banners2021/icici-ak-tp-27aug2021.gif";
		
		for(String Window:AllWindowId) {
			driver.switchTo().window(Window);
			String actualUrl=driver.getCurrentUrl();
			if(expectedUrl.equals(actualUrl))
			driver.close();
		}
	    
	}

}
