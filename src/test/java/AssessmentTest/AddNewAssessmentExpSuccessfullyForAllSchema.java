package AssessmentTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Assessment.MyAssessmentExperienceRequestsPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class AddNewAssessmentExpSuccessfullyForAllSchema extends TestBase {

	LoginPage LoginPageObj;
	MyAssessmentExperienceRequestsPage AssessmentExperienceRequestsPageObj;

	String Email = "Eiacstaffuser1@mailinator.com";
	String Password = "Akram@1234";

	String NumberOfAssessment = "5";
	String NumberOfYears = "3";

	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}

	@Test(priority = 2)
	public void AddNewAssessmentExpRequestSuccessfully() throws InterruptedException {
		AssessmentExperienceRequestsPageObj = new MyAssessmentExperienceRequestsPage(driver);
		AssessmentExperienceRequestsPageObj.AddNewAssessmentExpRequestForAllSchema(NumberOfAssessment, NumberOfYears);
		Assert.assertTrue(AssessmentExperienceRequestsPageObj.Validation.getText().contains("Added successfully"));
	}

}
