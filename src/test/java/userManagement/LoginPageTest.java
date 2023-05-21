package userManagement;

import org.testng.annotations.Test;

import userManagementPages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage LoginPageObj;

	String Email = "Eiac.staff.two@mailinator.com";
	String Password = "Akram@1234";

	@Test
	public void LoginSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		Thread.sleep(5000);
	}

}
