package userManagement;

import org.testng.annotations.Test;

import userManagementPages.LoginPage;
import userManagementPages.SwitchProfileViewPage;

public class SwitchProfileViewPageTest extends TestBase {

	LoginPage LoginPageObj;
	SwitchProfileViewPage SwitchProfileViewPageObj;

	String Email = "Accreditationdirector@mailinator.com";
	String Password = "Akram@1234";

	@Test
	public void SwitchToFullPageView() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		SwitchProfileViewPageObj = new SwitchProfileViewPage(driver);
		SwitchProfileViewPageObj.UserCanSwitchToFullPageViewProfile();
		SwitchProfileViewPageObj.UserCanSwitchToTabViewProfile();
	}

}
