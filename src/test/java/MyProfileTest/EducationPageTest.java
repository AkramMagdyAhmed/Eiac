package MyProfileTest;

import java.awt.AWTException;

import org.testng.annotations.Test;
import MyProfile.EducationPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;


public class EducationPageTest extends TestBase {
	
	LoginPage LoginPageObj;
	EducationPage EducationPageObj;
	
	String Email = "Eiacstaffuser@mailinator.com";
	String Password = "Akram@1234";
	
	
	String Institute = "6 oct uni";
	String major = "Computer Science ";
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	
	@Test(priority = 2)
	public void UserCanAddEducationSuccessfully() throws InterruptedException, AWTException
	{
		EducationPageObj = new EducationPage(driver);
		EducationPageObj.AddEducation(Institute, major);
		driver.close();
	}

}
