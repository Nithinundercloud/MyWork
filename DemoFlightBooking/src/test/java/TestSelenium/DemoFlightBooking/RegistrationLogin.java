package TestSelenium.DemoFlightBooking;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationLogin {
	@Test(dataProvider="user-register",dataProviderClass=DataProviderTest.class)
	public void registerUser(String name, String company, String email, String password,String confpassword){
		RepoObjTravelScreen.homemenu().click();
		
		RepoObjLoginPage.Register().click();
		
		RepoObjRegisterPage.enterName().sendKeys(name);
		
		RepoObjRegisterPage.enterCompany().sendKeys(company);
		
		RepoObjRegisterPage.enterEmail().sendKeys(email);
		
		RepoObjRegisterPage.enterPassword().sendKeys(password);
		
		RepoObjRegisterPage.confirmPassword().sendKeys(confpassword);
		
		RepoObjRegisterPage.enterRegister().click();
		
		Assert.assertEquals(RepoObjRegisterPage.registerResult().getText(), "Registartion Successfull");
	}
	
	
	@Test(dataProvider="user-credentials", dataProviderClass=DataProviderTest.class)
	public void loginSuccessfull(String email, String password)
	{
		RepoObjRegisterPage.goBack();
		
		RepoObjLoginPage.login().click();
		
		RepoObjLoginPage.enterEmail().sendKeys(email);
		
		RepoObjLoginPage.enterPassword().sendKeys(password);
		
		RepoObjLoginPage.login().click();
		
		Assert.assertEquals(RepoObjRegisterPage.registerResult().getText(), "Login Successfull");
	}
}
