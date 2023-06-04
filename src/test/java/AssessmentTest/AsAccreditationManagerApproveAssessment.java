package AssessmentTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Assessment.AllAssessmentExperienceRequestsPage;
import Assessment.MyAssessmentExperienceRequestsPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;
import userManagementPages.SignOut;

public class AsAccreditationManagerApproveAssessment extends TestBase {
	
	LoginPage LoginPageObj;
	AllAssessmentExperienceRequestsPage AllAssessmentExperienceRequestsPageObj;
	MyAssessmentExperienceRequestsPage AssessmentExperienceRequestsPageObj;
	SignOut SignOutObj;

	String Email = "Eiacstaffuser@mailinator.com";
	String Password = "Akram@1234";

	String AMEmail = "AccreditationManager@mailinator.com";
	String AMPassword = "Akram@1234";

	String NumberOfAssessment = "5";
	String NumberOfYears = "3";
	
	Faker fakeData = new Faker();
	String Feedback = fakeData.name().firstName(); 
	
	// Login with Eiac staff user
		@Test(priority = 1)
		public void loginSuccessfully() {
			LoginPageObj = new LoginPage(driver);
			LoginPageObj.UserCanLogin(Email, Password);
		}

		// Create New Assessment
		@Test(priority = 2)
		public void AddNewAssessmentExpRequestSuccessfully() throws InterruptedException {
			AssessmentExperienceRequestsPageObj = new MyAssessmentExperienceRequestsPage(driver);
			AssessmentExperienceRequestsPageObj.AddNewAssessmentExpRequestForAllSchema(NumberOfAssessment, NumberOfYears);
			Assert.assertTrue(AssessmentExperienceRequestsPageObj.Validation.getText().contains("Added successfully"));
			Thread.sleep(2000);
		}

		// Sign out
		@Test(priority = 3)
		public void UserCanSignOutSuccessfully() throws InterruptedException {
			SignOutObj = new SignOut(driver);
			SignOutObj.UserCanSignOut();
			Thread.sleep(1000);
		}

		// Login with Accreditation Manager User
		@Test(priority = 4)
		public void loginSuccessfullyWithAccManagerUser() {
			LoginPageObj = new LoginPage(driver);
			LoginPageObj.AMUserCanLogin(AMEmail, AMPassword);
		}
	
		// Acc Man perform Approve the assessment
	@Test(priority = 5)
	public void ApproveAssessmentSuccessfully() throws InterruptedException
	{
		AllAssessmentExperienceRequestsPageObj = new AllAssessmentExperienceRequestsPage(driver);
		AllAssessmentExperienceRequestsPageObj.ApproveAssessmentFromAccreditationManager(Feedback);
	}
	
	
	
	
	

}
