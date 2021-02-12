package TestSelenium.DemoFlightBooking;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class BaseFunction 
{
	public static WebDriver driver;
	@Parameters({"browser"})
	
  @BeforeSuite
   public static WebDriver setURL(String browser){
	   if(browser.equalsIgnoreCase("chrome")){
	   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"Resource"+File.separator+"chromedriver.exe");
	   driver = new ChromeDriver();}
	   if(browser.equalsIgnoreCase("mozilla")){
		   System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+File.separator+"Resource"+File.separator+"geckodriver.exe");
		   driver = new FirefoxDriver();   
	   }
	   driver.get("https://blazedemo.com/");
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   return driver;   
   }
	
	@AfterSuite
	public static void close(){
		driver.close();
	}
	
}
