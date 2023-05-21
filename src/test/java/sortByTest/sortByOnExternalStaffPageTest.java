package sortByTest;

import org.testng.annotations.Test;

import sortBy.sortByOnExternalStaffPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class sortByOnExternalStaffPageTest extends TestBase {

	LoginPage LoginPageObj;
	sortByOnExternalStaffPage sortByOnEiacStaffPageTestObj;

	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";

	@Test
	public void LoginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}

	@Test
	public void SortbyFullNamesuccessfully() throws InterruptedException {
		sortByOnEiacStaffPageTestObj = new sortByOnExternalStaffPage(driver);
		sortByOnEiacStaffPageTestObj.SortByFullName();
		Thread.sleep(3000);
	}

	@Test
	public void SortbyRequestedOnsuccessfully() throws InterruptedException {
		sortByOnEiacStaffPageTestObj = new sortByOnExternalStaffPage(driver);
		sortByOnEiacStaffPageTestObj.SortByRequestedOn();
		Thread.sleep(3000);
	}

}
