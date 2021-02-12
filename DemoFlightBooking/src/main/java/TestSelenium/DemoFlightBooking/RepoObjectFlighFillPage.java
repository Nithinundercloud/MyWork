package TestSelenium.DemoFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RepoObjectFlighFillPage extends BaseFunction{

	public static WebElement enterName(){
		return driver.findElement(By.id("inputName"));
	}
	public static WebElement enterAddress(){
		return driver.findElement(By.id("address"));
	}
	public static WebElement enterCity(){
		return driver.findElement(By.id("city"));
	}
	public static WebElement enterState(){
		return driver.findElement(By.id("state"));
	}
	public static WebElement enterZipCode(){
		return driver.findElement(By.id("zipCode"));
	}
	public static WebElement enterCreditCard(){
		return driver.findElement(By.id("creditCardNumber"));
	}
	public static WebElement enterNameOnCard(){
		return driver.findElement(By.id("nameOnCard"));
	}
	
	public static WebElement purchaceTicket(){
		return driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input"));
	}
}
