package AssessmentTest;

import org.testng.annotations.Test;

import Assessment.AssessmentsMembersPage;
import Assessment.MyAssessmentExperiencePage;
import MyProfile.AssessmentExperiencePage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class VerifyDeletebuttonOnAssessmentMemberPage extends TestBase {
	
	LoginPage LoginPageObj;
	AssessmentsMembersPage AssessmentsMembersPageObj;
	MyAssessmentExperiencePage MyAssessmentExperiencePageObj;
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	
	@Test(priority = 1)
	public void loginSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		Thread.sleep(2000);
	}

	@Test(priority = 2, enabled = false)
	public void ViewMemberSuccessfully() {
		
		AssessmentsMembersPageObj = new AssessmentsMembersPage(driver);
		AssessmentsMembersPageObj.ViewMember();	
	}
	
	@Test(priority = 3)
	public void DeleteMemberSuccessfully() throws InterruptedException {
		
		MyAssessmentExperiencePageObj = new MyAssessmentExperiencePage(driver);
		driver.navigate().to("https://eiac.mosandah.com.sa/admin/UserManagement/MyProfile/jkk9hgECemLVsSrBYjzvYbBFO5l0u89OK4KdhlPP?tab=8");
		Thread.sleep(2000);
		MyAssessmentExperiencePageObj.DeleteUserInAssessmentExperience();
	}
	
	
	
	
	
	
	

	
	

}
