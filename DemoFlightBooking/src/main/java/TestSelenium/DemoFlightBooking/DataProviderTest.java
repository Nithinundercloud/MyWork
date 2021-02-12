package TestSelenium.DemoFlightBooking;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

	
	@DataProvider(name="user-details")
	public Object[][] userdetails(){
	return new Object[][]{{"Thomas","Abc street1","Malagaon","karnataka","568550","1234568788"}};
}
	
	@DataProvider(name="user-register")
	public Object[][] userRegister(){
	return new Object[][]{{"Thomas","Abc street1","Malagaon@mail.com","karnataka","karnataka"}};
	}
	@DataProvider(name="user-credentials")
	public Object[][] userCredentials(){
	return new Object[][]{{"Malagaon@mail.com","karnataka"}};
}
}
