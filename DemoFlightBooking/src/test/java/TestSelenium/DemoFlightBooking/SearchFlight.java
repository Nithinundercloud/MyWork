package TestSelenium.DemoFlightBooking;

import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class SearchFlight
{
    /**
     * Rigorous Test :-)
     */
    @Test(dataProvider="user-details",dataProviderClass=DataProviderTest.class)
    public void SearchFlightForDestination(String name, String street, String city, String state, String zip,String credit)
    {
    	//click on book flight
    	RepoObjTravelScreen.findFlight().click();
    	
    	// select a random flight to book ticket ( applied equivalence partitioning)
    	RepoObjectReservePage.returnRandomFlight().click();
    	
    	//Enter details of the user
    	RepoObjectFlighFillPage.enterName().sendKeys(name);
    	
    	RepoObjectFlighFillPage.enterAddress().sendKeys(street);
    	
    	RepoObjectFlighFillPage.enterCity().sendKeys(city);
    	
    	RepoObjectFlighFillPage.enterState().sendKeys(state);
    	
    	RepoObjectFlighFillPage.enterZipCode().sendKeys(zip);
    	
    	RepoObjectFlighFillPage.enterCreditCard().sendKeys(credit);
    	
    	RepoObjectFlighFillPage.purchaceTicket().click();
    	
    	Assert.assertEquals(RepoObjectThankyouPage.thankYouText().getText(), "Thank you for your purchase today!");
    }
    
    @Test
    public void testWithoutDetails(){
    	/*
    	 * User should not be able to book without entering the details
    	 * 
    	 */
    	RepoObjTravelScreen.traveTheWorldMenu().click();
    	
    	//click on book flight
    	RepoObjTravelScreen.findFlight().click();
    	
    	// select a random flight to book ticket ( applied equivalence partitioning)
    	RepoObjectReservePage.returnRandomFlight().click();
    	
    	//purchace ticket
    	RepoObjectFlighFillPage.purchaceTicket().click();
    	
    	
    	Assert.assertEquals(RepoObjectThankyouPage.thankYouText().getText(), "Enter User details");
    }
}
