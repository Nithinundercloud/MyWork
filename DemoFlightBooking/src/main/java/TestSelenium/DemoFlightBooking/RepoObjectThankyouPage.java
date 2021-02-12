package TestSelenium.DemoFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RepoObjectThankyouPage extends BaseFunction{

	
	public static WebElement thankYouText(){
		return driver.findElement(By.xpath("/html/body/div[2]/div/h1"));
		
	}
}
