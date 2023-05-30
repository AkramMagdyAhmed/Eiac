package AssessmentTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Assessment.MyAssessmentExperienceRequestsPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class AddNewAssessmentBtnIsNotDisplayedWhileProfileIsNotComplete extends TestBase{
	
	LoginPage LoginPageObj;
	MyAssessmentExperienceRequestsPage AssessmentExperienceRequestsPageObj;
	
	String Email = "eiacstaffautomation@mailinator.com";
	String Password = "Akram@12344";
	
	String NumberOfAssessment = "5";
    String NumberOfYears = "3";
	
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test(priority = 2)
	public void AddNewAssessmentExpRequestSuccessfully() throws InterruptedException
	{
		AssessmentExperienceRequestsPageObj = new MyAssessmentExperienceRequestsPage(driver);
		AssessmentExperienceRequestsPageObj.ProfileNotCompleted();
		Assert.assertTrue(AssessmentExperienceRequestsPageObj.CompleteYourProfileText.getText().contains("It seems like you didn't complete your profile yet"));
	}
}
