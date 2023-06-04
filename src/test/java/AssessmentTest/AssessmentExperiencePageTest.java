package AssessmentTest;

import org.testng.annotations.Test;

import MyProfile.AssessmentExperiencePage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class AssessmentExperiencePageTest extends TestBase {
	
	
	LoginPage LoginPageObj;
	AssessmentExperiencePage AssessmentExperiencePageObj;
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test(priority = 2)
	public void NavigateBetweenSuccessfully() throws InterruptedException
	{
		AssessmentExperiencePageObj = new AssessmentExperiencePage(driver);
		AssessmentExperiencePageObj.NavigateBeetweenTabs();
	}

}
