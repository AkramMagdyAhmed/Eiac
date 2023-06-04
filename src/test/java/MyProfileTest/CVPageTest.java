package MyProfileTest;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyProfile.CVPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class CVPageTest extends TestBase {

	LoginPage LoginPageObj;
	CVPage CVPageObj;

	String Email = "Eiacstaffuser1@mailinator.com";
	String Password = "Akram@1234";

	@Test(priority = 1)
	public void LoginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}

	@Test(priority = 2)
	public void AddNewCVSuccessfully() throws InterruptedException, AWTException {
		CVPageObj = new CVPage(driver);
		CVPageObj.AddNewCv();
		Assert.assertTrue(CVPageObj.Validation.getText().contains("Added successfully"));
	}

}
