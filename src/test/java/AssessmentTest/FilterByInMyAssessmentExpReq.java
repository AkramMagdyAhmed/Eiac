package AssessmentTest;

import org.testng.annotations.Test;

import Assessment.MyAssessmentExperienceRequestsPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class FilterByInMyAssessmentExpReq extends TestBase {
	
	LoginPage LoginPageObj;
	MyAssessmentExperienceRequestsPage AssessmentExperienceRequestsPageObj;
	
	String Email = "Eiacstaffuser@mailinator.com";
	String Password = "Akram@1234";
	
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test(priority = 2)
	public void FilterBySuccessfully() throws InterruptedException
	{
		AssessmentExperienceRequestsPageObj = new MyAssessmentExperienceRequestsPage(driver);
		AssessmentExperienceRequestsPageObj.FilterBy();
	}

}
