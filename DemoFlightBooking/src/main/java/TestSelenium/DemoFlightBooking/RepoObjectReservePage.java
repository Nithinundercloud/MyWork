package TestSelenium.DemoFlightBooking;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RepoObjectReservePage extends BaseFunction {

	public static WebElement returnRandomFlight(){
		
		Random rand = new Random();
		int random = rand.nextInt(5);
		System.out.println("Radom table" + random );
		
		//Get the number of rows in the table
		WebElement tablerow = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr["+random+"]/td[1]/input"));
		
		return tablerow;
		
	}
}
