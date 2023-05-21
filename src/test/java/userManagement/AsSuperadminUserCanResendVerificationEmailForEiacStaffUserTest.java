package userManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import userManagementPages.EiacStaffPage;
import userManagementPages.LoginPage;

public class AsSuperadminUserCanResendVerificationEmailForEiacStaffUserTest extends TestBase {
	
	LoginPage LoginPageObj;
	EiacStaffPage EiacStaffPageObj;
	
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	
	@Test(enabled = false)
	public void ResendVerficationMailSuccessfully() throws InterruptedException
	{
		EiacStaffPageObj = new EiacStaffPage(driver);
		EiacStaffPageObj.ResendVerificationEmail();
		Assert.assertTrue(EiacStaffPageObj.ResendVerficationMailValidation.getText().contains("succsess"));
	}
	
	@Test(priority = 2)
	public void ResendVerficationMailFromViewSuccessfully() throws InterruptedException
	{
		EiacStaffPageObj = new EiacStaffPage(driver);
		EiacStaffPageObj.ResendVerificationEmailFromView();
		//Assert.assertTrue(EiacStaffPageObj.ResendVerficationMailValidation.getText().contains("succsess"));
	}
	
	
	
}
