package userManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import userManagementPages.CreateNewEiacStaffPage;
import userManagementPages.LoginPage;

public class AsExecutiveDirectorUserNewCreateEiacStaffPageTest extends TestBase {

	LoginPage LoginPageObj;
	CreateNewEiacStaffPage CreateNewEiacStaffPageObj;

	String Email = "eiacstaff2@mailinator.com";
	String Password = "120120";
	Faker fakeData = new Faker();
	String Firstname = fakeData.name().firstName();
	String Fathername = fakeData.name().lastName();
	String GrandFatherName = fakeData.name().firstName();
	String FamilyName = fakeData.name().firstName();
	// String Phone = fakeData.number().digits(10);
	String Phone = "1198563254";
	String Phone2 = fakeData.number().digits(8);
	String EmailAddress= fakeData.internet().emailAddress();

	@Test
	public void CreateEiacStaffSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		CreateNewEiacStaffPageObj = new CreateNewEiacStaffPage(driver);
		CreateNewEiacStaffPageObj.ExecutiveDirectorUserCanCreateEiacStaff(Firstname, Fathername, GrandFatherName, FamilyName, Email, Phone, EmailAddress);
//		Assert.assertTrue(AsExecutiveDirectorUserNewCreateEiacStaffPageObj.Validation.getText()
//				.contains("Account created"));
	}

}
