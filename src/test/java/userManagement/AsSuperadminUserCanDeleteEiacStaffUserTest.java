package userManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import userManagementPages.LoginPage;
import userManagementPages.deleteEiacStaff;

public class AsSuperadminUserCanDeleteEiacStaffUserTest extends TestBase {
	
	LoginPage LoginPageObj;
	deleteEiacStaff deleteEiacStaffObj;
	
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	

	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}

	@Test(priority = 2)
	public void DeleteEiacUserSuccessfullyinActiveTab() throws InterruptedException {
		deleteEiacStaffObj = new deleteEiacStaff(driver);
		deleteEiacStaffObj.deleteUserInActiveTab();
		Assert.assertTrue(deleteEiacStaffObj.Validation.getText().contains("Deleted Successfuly"));
	}

	@Test(priority = 3)
	public void DeleteEiacUserSuccessfullyinInactiveTab() throws InterruptedException {
		deleteEiacStaffObj = new deleteEiacStaff(driver);
		deleteEiacStaffObj.deleteUserInInactiveTab();
//		Assert.assertTrue(deleteEiacStaffObj.Validation.getText().contains("Deleted Successfuly"));
	}

	@Test(priority = 4)
	public void DeleteEiacUserSuccessfullyinInNotVerifiedYetTab() throws InterruptedException {
		deleteEiacStaffObj = new deleteEiacStaff(driver);
		deleteEiacStaffObj.deleteUserInNotVerifiedYetTab();
		Assert.assertTrue(deleteEiacStaffObj.Validation.getText().contains("Deleted Successfuly"));
	}
	
	@Test(priority = 5)
	public void DeleteEiacUserSuccessfullyinAwaitingApprovaltTabTab() throws InterruptedException {
		deleteEiacStaffObj = new deleteEiacStaff(driver);
		deleteEiacStaffObj.deleteUserInAwaitingApprovaltTab();
//		Assert.assertTrue(deleteEiacStaffObj.Validation.getText().contains("Deleted Successfuly"));
	}



}
