package TestSelenium.DemoFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RepoObjTravelScreen extends BaseFunction{

	public static WebElement departureCity(){
		return driver.findElement(By.name("fromPort"));
		
	}
	
	public static WebElement destinationCity(){
		return driver.findElement(By.name("toPort"));
		
	}
	
	public static WebElement destinationLink(){
		return driver.findElement(By.xpath("/html/body/div[2]/div/p[2]/a"));
		
	}
	
	public static WebElement findFlight(){
		 return driver.findElement(By.xpath("//input[contains(@value,'Find Flights')]"));
		
	}
	
	public static WebElement homemenu()
	{
		return driver.findElement(By.xpath("//*[text()='home']"));
	}
	
	public static WebElement traveTheWorldMenu()
	{
		return driver.findElement(By.xpath("//*[text()='Travel The World']"));
	}
}
