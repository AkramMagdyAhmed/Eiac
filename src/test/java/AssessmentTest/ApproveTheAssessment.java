package AssessmentTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Assessment.AllAssessmentExperienceRequestsPage;
import Assessment.MyAssessmentExperienceRequestsPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;
import userManagementPages.SignOut;

public class ApproveTheAssessment extends TestBase {

	LoginPage LoginPageObj;
	MyAssessmentExperienceRequestsPage AssessmentExperienceRequestsPageObj;
	SignOut SignOutObj;
	AllAssessmentExperienceRequestsPage AllAssessmentExperienceRequestsPageObj;

	String Email = "Eiacstaffuser@mailinator.com";
	String Password = "Akram@1234";

	String AMEmail = "AccreditationManager@mailinator.com";
	String AMPassword = "Akram@1234";

	String ADEmail = "AccreditationManager@mailinator.com";
	String ADPassword = "Akram@1234";

	String EDEmail = "AccreditationManager@mailinator.com";
	String EDPassword = "Akram@1234";
	Faker fakeData = new Faker();
	String Feedback = fakeData.name().firstName(); 
	String FeedbackForAssesor = fakeData.name().firstName(); 
	String NumberOfAssessment = "5";
	String NumberOfYears = "3";

	// Login with Eiac staff user
	@Test(priority = 1, enabled = false)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}

	// Create New Assessment
	@Test(priority = 2, enabled = false)
	public void AddNewAssessmentExpRequestSuccessfully() throws InterruptedException {
		AssessmentExperienceRequestsPageObj = new MyAssessmentExperienceRequestsPage(driver);
		AssessmentExperienceRequestsPageObj.AddNewAssessmentExpRequestForAllSchema(NumberOfAssessment, NumberOfYears);
		Assert.assertTrue(AssessmentExperienceRequestsPageObj.Validation.getText().contains("Added successfully"));
		Thread.sleep(2000);
	}

	// Sign out
	@Test(priority = 3, enabled = false)
	public void UserCanSignOutSuccessfully() throws InterruptedException {
		SignOutObj = new SignOut(driver);
		SignOutObj.UserCanSignOut();
		Thread.sleep(1000);
	}

	// Login with Accreditation Manager User
	@Test(priority = 4, enabled = true)
	public void loginSuccessfullyWithAccManagerUser() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.AMUserCanLogin(AMEmail, AMPassword);
	}

	// Approve assessment from Accreditation manager user
	@Test(priority = 5, enabled = true)
	public void AsAccreditationManagerApproveAssessmentSuccessfully() throws InterruptedException {
		Assert.assertTrue(AllAssessmentExperienceRequestsPageObj.WaitingMyDicision.getText().contains("Waiting my decision"));
		AllAssessmentExperienceRequestsPageObj = new AllAssessmentExperienceRequestsPage(driver);
		AllAssessmentExperienceRequestsPageObj.ApproveAssessmentFromAccreditationManager(Feedback);
		Assert.assertTrue(AllAssessmentExperienceRequestsPageObj.WaitingAccreditationDirectorDecisionnStatus.getText().contains("Waiting Accreditation Director decision"));
	}
	// Sign out
	@Test(priority = 6)
	public void AccreditationManagerCanSignOutSuccessfully() throws InterruptedException {
		SignOutObj = new SignOut(driver);
		SignOutObj.UserCanSignOut();
		Thread.sleep(1000);
	}

	// Login with Accreditation Director User
	@Test(priority = 7, enabled = true)
	public void loginSuccessfullyWithAccDirectorUser() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.ADUserCanLogin(AMEmail, AMPassword);
	}

	// Approve assessment from Accreditation Director user
	@Test(priority = 8, enabled = true)
	public void AsAccreditationDirectorApproveAssessmentSuccessfully() throws InterruptedException {
		Assert.assertTrue(AllAssessmentExperienceRequestsPageObj.WaitingMyDicision.getText().contains("Waiting my decision"));
		AllAssessmentExperienceRequestsPageObj = new AllAssessmentExperienceRequestsPage(driver);
		AllAssessmentExperienceRequestsPageObj.ApproveAssessmentFromAccreditationDirector(Feedback);
		Assert.assertTrue(AllAssessmentExperienceRequestsPageObj.WaitingExecutiveDirectorDecisionnStatus.getText().contains(" Waiting Executive Director Decision "));
	}

	// Sign out
	@Test(priority = 6)
	public void AccreditationDirectorCanSignOutSuccessfully() throws InterruptedException {
		SignOutObj = new SignOut(driver);
		SignOutObj.UserCanSignOut();
		Thread.sleep(1000);
	}

	// Login with Executive Director User
	@Test(priority = 7, enabled = true)
	public void loginSuccessfullyWithExcutiveDirectorUser() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.ADUserCanLogin(ADEmail, ADPassword);
	}

	// Approve assessment from Executive Director user
	@Test(priority = 8, enabled = true)
	public void AsEDirectorApproveAssessmentSuccessfully() throws InterruptedException {
		Assert.assertTrue(AllAssessmentExperienceRequestsPageObj.WaitingMyDicision.getText().contains("Waiting my decision"));
		AllAssessmentExperienceRequestsPageObj = new AllAssessmentExperienceRequestsPage(driver);
		AllAssessmentExperienceRequestsPageObj.ApproveAssessmentFromExecutiveDirector(Feedback, FeedbackForAssesor);
		Assert.assertTrue(AllAssessmentExperienceRequestsPageObj.ApprovedStatus.getText().contains("Approved"));
	}

}
