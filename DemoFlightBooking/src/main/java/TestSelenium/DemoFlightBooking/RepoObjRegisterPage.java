package TestSelenium.DemoFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RepoObjRegisterPage extends BaseFunction {

	
	public static WebElement enterName(){
		return driver.findElement(By.id("name"));
	}
	
	public static WebElement enterCompany(){
		return driver.findElement(By.id("company"));
	}
	
	public static WebElement enterEmail(){
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement enterPassword(){
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement confirmPassword(){
		return driver.findElement(By.id("password-confirm"));
	}
	
	public static WebElement enterRegister(){
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button"));
	}
	
	public static WebElement registerResult(){
		return driver.findElement(By.xpath("/html/body/div/div[1]"));
	}
	
	public static void goBack(){
		 driver.navigate().back();
	}
}
