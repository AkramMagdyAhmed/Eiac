package searchFeatureTest;

import org.testng.annotations.Test;

import searchFeature.SearchOnExternalStaffPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class SearchOnExternalStaffPageTest  extends TestBase{
	
	LoginPage LoginPageObj;
	SearchOnExternalStaffPage SearchOnExternalStaffPageObj;
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	
	
	String Text="Eiac staff user one";
	
	
	@Test
	public void LoginSuccessfully()
	{
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test
	public void RetrieveCorrectUserInActiveTab() throws InterruptedException
	{
		SearchOnExternalStaffPageObj = new SearchOnExternalStaffPage(driver);
		SearchOnExternalStaffPageObj.OpenSearchonExternalStaffPageinActiveTab(Text);
	}

}
