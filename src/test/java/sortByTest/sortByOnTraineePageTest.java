package sortByTest;

import org.testng.annotations.Test;

import sortBy.sortByOnTraineePage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class sortByOnTraineePageTest  extends TestBase{
	
	
	LoginPage LoginPageObj;
	sortByOnTraineePage sortByOnTraineePageObj;

	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";

	@Test
	public void LoginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}

	@Test
	public void SortbyFullNamesuccessfully() throws InterruptedException {
		sortByOnTraineePageObj = new sortByOnTraineePage(driver);
		sortByOnTraineePageObj.SortByFullName();
		Thread.sleep(3000);
	}

	@Test
	public void SortbyRequestedOnsuccessfully() throws InterruptedException {
		sortByOnTraineePageObj = new sortByOnTraineePage(driver);
		sortByOnTraineePageObj.SortByRequestedOn();
		Thread.sleep(3000);
	}

}
