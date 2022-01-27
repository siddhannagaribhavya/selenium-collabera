package SelectClass;

import java.util.List;                    
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

       public class ToHandleDropDown2 {
	   public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayListbox=driver.findElement(By.id("day"));
		WebElement monthListbox=driver.findElement(By.id("month"));
		WebElement yearListbox=driver.findElement(By.id("year"));
		Select dayselect=new Select(dayListbox);
        System.out.println(dayselect.isMultiple());
        dayselect.selectByIndex(6);
       // List<WebElement>daylistboxoptions=dayselect.getOptions();
       // for(WebElement ele:daylistboxoptions)
       // {
       // System.out.println(ele.getText());
       // }
        
        
      
        Select monthselect=new Select(monthListbox);
        System.out.println(dayselect.isMultiple());
        monthselect.selectByIndex(1);
     //   System.out.println(monthselect.getText());
       // List<WebElement>monthlistboxoptions=driver.findElements(By.xpath("//select[@id='month']/option"));
     // System.out.println(monthselect.getText());
      //  for(WebElement ele:monthlistboxoptions)
     //   {
    //    System.out.println(ele.getText());
    //    }
        
        

          Select yearselect=new Select(yearListbox);
          System.out.println(yearselect.isMultiple());
          //to enter particular value by using visible text
          yearselect.selectByVisibleText("1998");
         // List<WebElement>yearlistboxoptions=driver.findElements(By.xpath("//select[@id='year']"));
         // for(WebElement ele:yearlistboxoptions)
         // {
         // System.out.println(ele.getText());
        //  }
  }

        
      
}


