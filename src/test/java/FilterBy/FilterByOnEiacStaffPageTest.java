package FilterBy;

import org.testng.annotations.Test;

import userManagement.TestBase;
import userManagementPages.EiacStaffPage;
import userManagementPages.LoginPage;

public class FilterByOnEiacStaffPageTest extends TestBase {
	
	LoginPage LoginPageObj;
	EiacStaffPage EiacStaffPageObj;
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	
	
	@Test
	public void LoginSuccessfully()
	{
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	
	@Test
	public void FilterBySuccessfully()
	{
		EiacStaffPageObj = new EiacStaffPage(driver);
		EiacStaffPageObj.UserCanFilter();
	}
}
