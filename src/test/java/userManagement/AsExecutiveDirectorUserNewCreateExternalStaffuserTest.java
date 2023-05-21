package userManagement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import userManagementPages.CreateNewExternalStaffUsersPage;
import userManagementPages.LoginPage;

public class AsExecutiveDirectorUserNewCreateExternalStaffuserTest  extends TestBase{

	LoginPage LoginPageObj;
	CreateNewExternalStaffUsersPage CreateNewExternalStaffUsersPageObj;
	
	String Email = "eiacstaff2@mailinator.com";
	String Password = "120120";
	Faker fakeData = new Faker();
	String Firstname = fakeData.name().firstName();
	String Fathername = fakeData.name().lastName();
	String GrandFatherName = fakeData.name().firstName();
	String FamilyName = fakeData.name().firstName();
	String NationalID = fakeData.number().digits(10);
	// String Phone = fakeData.number().digits(10);
	String Phone = "1198563254";
	String Phone2 = fakeData.number().digits(8);
	String EmailAddress = fakeData.internet().emailAddress();

	@Test
	public void CreateExternalStaffSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		CreateNewExternalStaffUsersPageObj = new CreateNewExternalStaffUsersPage(driver);
		CreateNewExternalStaffUsersPageObj.UserCanCreateExternalStaff(Firstname, Fathername, GrandFatherName,
				FamilyName, FamilyName, NationalID, Phone, EmailAddress);
		Assert.assertTrue(CreateNewExternalStaffUsersPageObj.Validation.getText().contains("account created and activated successfully"));
	}

	
	

}
