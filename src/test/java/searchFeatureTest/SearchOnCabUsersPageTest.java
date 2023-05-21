package searchFeatureTest;

import org.testng.annotations.Test;

import searchFeature.SearchOnCabUsersPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class SearchOnCabUsersPageTest extends TestBase {
	
	
	LoginPage LoginPageObj;
	SearchOnCabUsersPage SearchOnCabUsersPageObj;
	
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	
	
	String Text = "Eiac staff user one";
	
	@Test
	public void LoginSuccessfully()
	{
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test
	public void RetrieveCorrectUserInActiveTab() throws InterruptedException
	{
		SearchOnCabUsersPageObj = new SearchOnCabUsersPage(driver);
		SearchOnCabUsersPageObj.OpenSearchonCabUsersPageinActiveTab(Text);
	}
	

}
