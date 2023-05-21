package sortByTest;

import org.testng.annotations.Test;

import sortBy.sortByOnCabsUsersPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class sortByOnCabUsersPageTest extends TestBase {
	
	LoginPage LoginPageObj;
	sortByOnCabsUsersPage sortByOnCabsUsersPageObj;
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";

	@Test
	public void LoginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}

	@Test
	public void SortbyFullNamesuccessfully() throws InterruptedException {
		sortByOnCabsUsersPageObj = new sortByOnCabsUsersPage(driver);
		sortByOnCabsUsersPageObj.SortByFullName();
		Thread.sleep(3000);
	}

	@Test
	public void SortbyMemberSincesuccessfully() throws InterruptedException {
		sortByOnCabsUsersPageObj = new sortByOnCabsUsersPage(driver);
		sortByOnCabsUsersPageObj.SortByRequestedOn();
		Thread.sleep(3000);
	}

}
