package TestSelenium.DemoFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RepoObjLoginPage extends BaseFunction{

	
	public static WebElement enterEmail(){
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement enterPassword(){
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement login(){
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button"));
	}
	
	public static WebElement Register(){
		return driver.findElement(By.xpath("//*[text()='Register']"));
	}
}
