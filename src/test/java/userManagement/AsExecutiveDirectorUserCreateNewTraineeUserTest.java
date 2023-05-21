package userManagement;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import userManagementPages.CreateNewTraineeUsersPage;
import userManagementPages.LoginPage;

public class AsExecutiveDirectorUserCreateNewTraineeUserTest  extends TestBase{
	
	
	LoginPage LoginPageObj;
	CreateNewTraineeUsersPage CreateNewTraineeUsersPageObj;
	
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
	String EmailAddress = fakeData.internet().emailAddress();
	
	@Test
	public void CreateTraineeUserSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		CreateNewTraineeUsersPageObj = new CreateNewTraineeUsersPage(driver);
		CreateNewTraineeUsersPageObj.UserCanCreateTraineeStaff(Firstname, Fathername, GrandFatherName, FamilyName, Phone, EmailAddress);
	}
	
	

}
