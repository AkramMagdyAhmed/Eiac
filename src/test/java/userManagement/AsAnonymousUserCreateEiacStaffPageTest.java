package userManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import userManagementPages.AsAnonymousUserCreateEiacStaff;
import userManagementPages.LoginPage;

public class AsAnonymousUserCreateEiacStaffPageTest extends TestBase {

	LoginPage LoginPageObj;
	AsAnonymousUserCreateEiacStaff AsAnonymousUserCreateEiacStaffOBj;

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
	public void CreateEiacStaffSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.CreateAccountLink();
		AsAnonymousUserCreateEiacStaffOBj = new AsAnonymousUserCreateEiacStaff(driver);
		AsAnonymousUserCreateEiacStaffOBj.UserCanCreateEiacStaff(Firstname, Fathername, GrandFatherName, FamilyName,
				FamilyName, NationalID, Phone, Email, Password);
		Assert.assertTrue(
				AsAnonymousUserCreateEiacStaffOBj.Validation.getText().contains("Account created successfully"));
	}

}
