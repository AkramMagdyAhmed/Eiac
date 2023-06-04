package AssessmentTest;

import org.testng.annotations.Test;

import Assessment.AllAssessmentExperienceRequestsPage;
import Assessment.AssessmentsMembersPage;
import Assessment.MyAssessmentExperiencePage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class ViewFeedback extends TestBase {
	
	
	LoginPage LoginPageObj;
	AssessmentsMembersPage AssessmentsMembersPageObj;
	MyAssessmentExperiencePage MyAssessmentExperiencePageObj;
	AllAssessmentExperienceRequestsPage AllAssessmentExperienceRequestsPageObj;
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	
	@Test(priority = 1)
	public void loginSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		Thread.sleep(2000);
	}
	@Test(priority = 2,enabled = false)
	public void ViewAssessmentSuccessfully() throws InterruptedException
	{
		AllAssessmentExperienceRequestsPageObj = new AllAssessmentExperienceRequestsPage(driver);
		AllAssessmentExperienceRequestsPageObj.ViewAssessment();
	}
	@Test(priority = 3)
	public void ViewFeedbackSuccessfully() throws InterruptedException
	{
		driver.navigate().to("https://eiac.mosandah.com.sa/admin/AllAssessmentsExperienceRequestsList/AllAssessmentsExperienceRequestsDetails/hka1MESE50UTQF7gXyQTH4UtRcyWZjdD8knV872u");
		Thread.sleep(1000);
		AllAssessmentExperienceRequestsPageObj = new AllAssessmentExperienceRequestsPage(driver);
		AllAssessmentExperienceRequestsPageObj.ViewFeedback();
	}
	

}
