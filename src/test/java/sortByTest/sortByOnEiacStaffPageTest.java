package sortByTest;

import org.testng.annotations.Test;

import sortBy.sortByOnEiacStaffPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class sortByOnEiacStaffPageTest extends TestBase {

	LoginPage LoginPageObj;
	sortByOnEiacStaffPage sortByOnEiacStaffPageTestObj;

	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";

	@Test
	public void LoginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}

	@Test
	public void SortbyFullNamesuccessfully() throws InterruptedException {
		sortByOnEiacStaffPageTestObj = new sortByOnEiacStaffPage(driver);
		sortByOnEiacStaffPageTestObj.SortByFullName();
		Thread.sleep(3000);
	}

	@Test
	public void SortbyMemberSincesuccessfully() throws InterruptedException {
		sortByOnEiacStaffPageTestObj = new sortByOnEiacStaffPage(driver);
		sortByOnEiacStaffPageTestObj.SortByMemberSince();
		Thread.sleep(3000);
	}

}
