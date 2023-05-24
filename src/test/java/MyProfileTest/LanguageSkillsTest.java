package MyProfileTest;

import org.testng.annotations.Test;

import MyProfile.LanguageSkillsPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class LanguageSkillsTest extends TestBase {
	
	LoginPage LoginPageObj;
	LanguageSkillsPage LanguageSkillsPageObj;
	
	String Email="Eiacstaffuser@mailinator.com";
	String Password="Akram@1234";
	
	@Test
	public void LoginSuccessfully()
	{
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test
	public void AddLanguageSkillsSuccessfully()
	{
		LanguageSkillsPageObj = new LanguageSkillsPage(driver);
		LanguageSkillsPageObj.AddLanguageSkills();
	}
}