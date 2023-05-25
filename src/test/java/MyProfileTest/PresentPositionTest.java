package MyProfileTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import MyProfile.PresentPositionPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class PresentPositionTest extends TestBase {
	
	LoginPage LoginPageObj;
	PresentPositionPage PresentPositionPageObj;
	
	String Email ="Eiacstaffuser@mailinator.com";
	String Password ="Akram@1234";
	
	Faker fakeData = new Faker();
	
	
	String JobTitle = fakeData.job().position();
	String Company = fakeData.company().name();
	String DutiesAndResponsibilities = fakeData.name().fullName();
	
	@Test(priority = 1)
	public void LoginSuccessfully()
	{
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test(priority = 2)
	public void AddNewPresentPositionSuccessfully () throws InterruptedException
	{
		PresentPositionPageObj = new PresentPositionPage(driver);
		PresentPositionPageObj.AddPresentPosition(JobTitle, Company, DutiesAndResponsibilities);
		Assert.assertTrue(PresentPositionPageObj.Validation.getText().contains("Added successfully"));
	}
	
	

}
