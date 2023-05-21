package searchFeatureTest;

import org.testng.annotations.Test;

import searchFeature.SearchOnEiacStaffPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class SearchOnEiacStaffPageTest  extends TestBase{
	
	
	LoginPage LoginPageObj;
	SearchOnEiacStaffPage SearchOnEiacStaffPageObj;
	
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
		SearchOnEiacStaffPageObj = new SearchOnEiacStaffPage(driver);
		SearchOnEiacStaffPageObj.OpenSearchonEiacStaffPageinActiveTab(Text);
	}
	

}
