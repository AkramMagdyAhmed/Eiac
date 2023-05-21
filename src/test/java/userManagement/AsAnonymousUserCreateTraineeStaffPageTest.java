package userManagement;

import org.testng.annotations.Test;
import com.github.javafaker.Faker;

import userManagementPages.AsAnonymousUserCreateTraineeStaffPage;
import userManagementPages.LoginPage;

public class AsAnonymousUserCreateTraineeStaffPageTest extends TestBase {

	LoginPage LoginPageObj;
	AsAnonymousUserCreateTraineeStaffPage AsAnonymousUserCreateTraineeStaffPageObj;
	
	Faker fakeData = new Faker();
	String Firstname = fakeData.name().firstName();
	String Fathername = fakeData.name().lastName();
	String GrandFatherName = fakeData.name().firstName();
	String FamilyName = fakeData.name().firstName();
	// String Phone = fakeData.number().digits(10);
	String Phone = "1198563254";
	String Phone2 = fakeData.number().digits(8);
	String Email = fakeData.internet().emailAddress();
	String Password = "Akram@1234";
	
	@Test
	public void CreateExternalStaffSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.CreateAccountLink();
		AsAnonymousUserCreateTraineeStaffPageObj = new AsAnonymousUserCreateTraineeStaffPage(driver);
		AsAnonymousUserCreateTraineeStaffPageObj.UserCanCreateTraineeStaff(Firstname, Fathername, GrandFatherName, FamilyName, Phone, Email, Password);
}
}