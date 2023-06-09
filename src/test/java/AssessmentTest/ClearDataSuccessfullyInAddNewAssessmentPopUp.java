package AssessmentTest;

import org.testng.annotations.Test;

import Assessment.MyAssessmentExperienceRequestsPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class ClearDataSuccessfullyInAddNewAssessmentPopUp extends TestBase {
	
	LoginPage LoginPageObj;
	MyAssessmentExperienceRequestsPage AssessmentExperienceRequestsPageObj;
	
	String Email = "Eiacstaffuser@mailinator.com";
	String Password = "Akram@1234";
	
	String NumberOfAssessment = "5";
	String NumberOfYears = "3";
	
	
	
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test(priority = 2)
	public void ClearDataSuccessfully() throws InterruptedException {
		AssessmentExperienceRequestsPageObj = new MyAssessmentExperienceRequestsPage(driver);
		AssessmentExperienceRequestsPageObj.ClearDataInForm(NumberOfAssessment, NumberOfYears);
		
	}
}
