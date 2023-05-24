package MyProfileTest;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import MyProfile.PersonalInfoPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class PersonalInfoPageTest extends TestBase {
	
	
	
	LoginPage LoginPageObj;
	PersonalInfoPage PersonalInfoPageObj;
	
	String Email = "Accreditationdirector@mailinator.com";
	String Password = "Akram@1234";
	

	Faker fakeData = new Faker();
	String Firstname = fakeData.name().firstName();
	String Fathername = fakeData.name().lastName();
	String GrandFatherName = fakeData.name().firstName();
	String FamilyName = fakeData.name().firstName();
	// String Phone = fakeData.number().digits(10);
	String Phone = "1198563254";
	String Phone2 = fakeData.number().digits(8);
	String EmailAddress= fakeData.internet().emailAddress();
	//String NationalID = fakeData.number().digit();
	String NationalID = "1198595254";
	
	@Test(priority = 1)
	public void loginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}
	
	@Test(priority = 2)
	public void UserCanEditMyProfileSuccessfully() throws AWTException, InterruptedException
	{
		PersonalInfoPageObj = new PersonalInfoPage(driver);
		PersonalInfoPageObj.EditPersonalInfo(Firstname, Fathername, GrandFatherName, FamilyName, Email, Phone, NationalID);
	}
}