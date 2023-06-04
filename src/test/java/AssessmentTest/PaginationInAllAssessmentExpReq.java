package AssessmentTest;

import org.testng.annotations.Test;

import Assessment.AllAssessmentExperienceRequestsPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class PaginationInAllAssessmentExpReq extends TestBase{
	
	LoginPage LoginPageObj;
	AllAssessmentExperienceRequestsPage AllAssessmentExperienceRequestsPageObj;
	
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	
	@Test(priority = 2)
	public void paginateBeetweenPagesSuccessfully() throws InterruptedException
	{
		AllAssessmentExperienceRequestsPageObj = new AllAssessmentExperienceRequestsPage(driver);
		AllAssessmentExperienceRequestsPageObj.VerifyPagination();
	}

}
