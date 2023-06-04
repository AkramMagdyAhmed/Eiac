package MyProfileTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import MyProfile.OtherSkills;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class OtherSkillsPageTest extends TestBase {

	LoginPage LoginPageObj;
	OtherSkills OtherSkillsObj;

	String Email = "Eiacstaffuser1@mailinator.com";
	String Password = "Akram@1234";

	Faker fakeData = new Faker();
	
	String SkillName = fakeData.book().author();
	String Description = fakeData.book().author();
	String Note = fakeData.address().streetAddress();

	@Test(priority=1)

	public void LoginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}

	@Test(priority = 2)
	public void AddNewOtherSkillsSuccessfully()
	{
		OtherSkillsObj = new OtherSkills(driver);
		OtherSkillsObj.AddOtherSkills(SkillName, Description, Note);
		Assert.assertTrue(OtherSkillsObj.Validation.getText().contains("Successfully Added"));
		}
}