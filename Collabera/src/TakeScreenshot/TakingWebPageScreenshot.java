  package TakeScreenshot;

  import java.io.File;
  import java.util.concurrent.TimeUnit;

  import org.openqa.selenium.By;
  import org.openqa.selenium.OutputType;
  import org.openqa.selenium.chrome.ChromeDriver;

  public class TakingWebPageScreenshot {

	private static final String WeScreenshot = null;

	public static void main(String[] args) throws InterruptedException 
	{
		      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	          ChromeDriver driver=new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	          driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
	          
	          Thread.sleep(2000);
	          
	        driver.get("https://www.zomato.com/");
	        File tempfile=driver.getScreenshotAs(OutputType.FILE);
	        System.out.println(tempfile);
	        File destfile=new File("error1/scrnshot1.png");
	        tempfile.renameTo(destfile);
	         
	        File Webscreenshot=driver.findElement(By.xpath("//a[.='Add restaurant']")).getScreenshotAs(OutputType.FILE);
	        destfile=new File("error1/wesc.png");
	        Webscreenshot.renameTo( destfile);
	         
	}

}
