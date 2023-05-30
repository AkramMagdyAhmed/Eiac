package AssessmentTest;

import org.testng.annotations.Test;

import Assessment.MyAssessmentExperienceRequestsPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class SerarchInMyAssessmentExpReq extends TestBase {
	
	LoginPage LoginPageObj;
	MyAssessmentExperienceRequestsPage AssessmentExperienceRequestsPageObj;
	
	String Email = "Eiacstaffuser@mailinator.com";
	String Password = "Akram@1234";
	
	String Assessment = "Testing Labs";
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test(priority = 2)
	public void SearchSuccessfully() throws InterruptedException
	{
		AssessmentExperienceRequestsPageObj = new MyAssessmentExperienceRequestsPage(driver);
		AssessmentExperienceRequestsPageObj.Search(Assessment);
	}
}
