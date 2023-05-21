package userManagement;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import userManagementPages.CreateNewCabUserPage;
import userManagementPages.LoginPage;

public class AsSuperadminUserNewCreateCabUserTest extends TestBase {
	
	LoginPage LoginPageObj;
	CreateNewCabUserPage CreateNewCabUserPageObj;
	
	String Email = "mahmoud.eid@mosandah.com.sa";
	String Password = "eiac@2022";
	Faker fakeData = new Faker();
	String Firstname = fakeData.name().firstName();
	String Fathername = fakeData.name().lastName();
	String GrandFatherName = fakeData.name().firstName();
	String FamilyName = fakeData.name().firstName();
	String Phone = "1198563254";
	String CabNameInEnglish = fakeData.name().firstName();
	String CabNameInArabic = " يوزر ";
	String EmailAddress= fakeData.internet().emailAddress();

	@Test
	public void CreateCabusersSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		CreateNewCabUserPageObj = new CreateNewCabUserPage(driver);
		CreateNewCabUserPageObj.UserCanCreateCabUser(Firstname, Fathername, GrandFatherName, FamilyName, Phone, CabNameInEnglish, CabNameInArabic, EmailAddress);
		
	}

}
