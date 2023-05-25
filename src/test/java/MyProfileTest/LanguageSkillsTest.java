package MyProfileTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyProfile.LanguageSkillsPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class LanguageSkillsTest extends TestBase {
	
	LoginPage LoginPageObj;
	LanguageSkillsPage LanguageSkillsPageObj;
	
	String Email ="Eiacstaffuser@mailinator.com";
	String Password ="Akram@1234";
	
	@Test(priority = 1)
	public void LoginSuccessfully()
	{
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test(priority = 2)
	public void AddLanguageSkillsSuccessfully() throws InterruptedException
	{
		LanguageSkillsPageObj = new LanguageSkillsPage(driver);
		LanguageSkillsPageObj.AddLanguageSkills();
		Assert.assertTrue(LanguageSkillsPageObj.Validation.getText().contains("Successfully Added"));
		Thread.sleep(3000);
		driver.close();
	}
}