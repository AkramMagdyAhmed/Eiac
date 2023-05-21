package userManagement;

import org.testng.annotations.Test;

import userManagementPages.EiacStaffPage;
import userManagementPages.LoginPage;

public class AsSuperadminUserCanActivateEiacStaffUserTest extends TestBase {
	
	LoginPage LoginPageObj;
	EiacStaffPage EiacStaffPageObj;
	
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	
	@Test(priority = 2)
	public void ActivateUserSuccessfully() throws InterruptedException
	{
		EiacStaffPageObj = new EiacStaffPage(driver);
		EiacStaffPageObj.ActivateUser();
		Thread.sleep(3000);
	}

}
