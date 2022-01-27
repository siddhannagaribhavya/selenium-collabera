package Assignement;

import org.openqa.selenium.chrome.ChromeDriver;

public class getthetitleUrlpagesource {

    public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    //get title
       String gt=driver.getTitle();
       System.out.println(gt);
       //get pagesource
       String pg=driver.getPageSource();
       System.out.println(pg);
       //get currenturl
       String url=driver.getCurrentUrl();
       System.out.println(url);
       
       
	}
    

}



