package MyProfileTest;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import MyProfile.TrainingPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class TrainingPageTest extends TestBase {

	LoginPage LoginPageObj;
	TrainingPage TrainingPageObj;

	String Email = "Eiacstaffuser1@mailinator.com";
	String Password = "Akram@1234";
	
	Faker fakeData = new Faker();
	String CourseTitle = fakeData.ancient().hero();
	String OrganizationInstitute = fakeData.company().name();

	@Test(priority = 1)
	public void LoginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}

	@Test(priority = 2)
	public void addNewTrainingSuccessfully() throws InterruptedException, AWTException {
		TrainingPageObj = new TrainingPage(driver);
		TrainingPageObj.AddNewTraining(CourseTitle, OrganizationInstitute);
		Assert.assertTrue(TrainingPageObj.Validation.getText().contains("Successfully Added"));
	}

}
