package userManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import userManagementPages.AsAnonymousUserCreateExternalStaffPage;
import userManagementPages.LoginPage;

public class AsAnonymousUserCreateExternalStaffPageTest extends TestBase {

	LoginPage LoginPageObj;
	AsAnonymousUserCreateExternalStaffPage AsAnonymousUserCreateExternalStaffPageObj;

	Faker fakeData = new Faker();
	String Firstname = fakeData.name().firstName();
	String Fathername = fakeData.name().lastName();
	String GrandFatherName = fakeData.name().firstName();
	String FamilyName = fakeData.name().firstName();
	String NationalID = fakeData.number().digits(10);
	// String Phone = fakeData.number().digits(10);
	String Phone = "1198563254";
	String Phone2 = fakeData.number().digits(8);
	String Email = fakeData.internet().emailAddress();
	String Password = "Akram@1234";

	@Test
	public void CreateExternalStaffSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.CreateAccountLink();
		AsAnonymousUserCreateExternalStaffPageObj = new AsAnonymousUserCreateExternalStaffPage(driver);
		AsAnonymousUserCreateExternalStaffPageObj.UserCanCreateExternalStaff(Firstname, Fathername, GrandFatherName,
				FamilyName, FamilyName, NationalID, Phone, Email, Password);
		Assert.assertTrue(
				AsAnonymousUserCreateExternalStaffPageObj.Validation.getText().contains("Account created successfully"));
	}
}
