package AssessmentTest;

import org.testng.annotations.Test;

import Assessment.AllAssessmentExperienceRequestsPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class SerarchInAllAssessmentExpReq extends TestBase {
	
	
	LoginPage LoginPageObj;
	AllAssessmentExperienceRequestsPage AllAssessmentExperienceRequestsPageObj;
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	
	String Assessment = "Testing Labs";
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test(priority = 2)
	public void SearchSuccessfully() throws InterruptedException
	{
		AllAssessmentExperienceRequestsPageObj = new AllAssessmentExperienceRequestsPage(driver);
		AllAssessmentExperienceRequestsPageObj.Search(Assessment);
	}
	
	
	
	
	

}
