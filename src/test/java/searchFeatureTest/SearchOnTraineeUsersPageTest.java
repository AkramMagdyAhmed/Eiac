package searchFeatureTest;

import org.testng.annotations.Test;

import searchFeature.SearchOnTraineesUsersPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class SearchOnTraineeUsersPageTest extends TestBase {
	
	LoginPage LoginPageObj;
	SearchOnTraineesUsersPage SearchOnTraineesUsersPageObj;
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	
	
	String Text = "Eiac staff user one";
	
	
	
	public void LoginSuccessfully()
	{
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test
	public void RetrieveCorrectUserInActiveTab() throws InterruptedException
	{
		SearchOnTraineesUsersPageObj = new SearchOnTraineesUsersPage(driver);
		SearchOnTraineesUsersPageObj.OpenSearchonTraineePageinActiveTab(Text);
	}

}
