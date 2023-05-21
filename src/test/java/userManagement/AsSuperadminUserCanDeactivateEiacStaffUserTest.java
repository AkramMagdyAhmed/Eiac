package userManagement;

import org.testng.annotations.Test;

import userManagementPages.EiacStaffPage;
import userManagementPages.LoginPage;

public class AsSuperadminUserCanDeactivateEiacStaffUserTest extends TestBase {
	
	
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
	public void DeactivateUserSuccessfully() throws InterruptedException
	{
		EiacStaffPageObj = new EiacStaffPage(driver);
		EiacStaffPageObj.DeactivateUser();
		Thread.sleep(3000);
	}

}
