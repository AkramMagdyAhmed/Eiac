package userManagement;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import userManagementPages.AsAnonymousUserCreateCabUserPage;
import userManagementPages.LoginPage;

public class AsAnonymousUserCreateCabUserPageTest extends TestBase {

	LoginPage LoginPageObj;
	AsAnonymousUserCreateCabUserPage AsAnonymousUserCreateCabUserPageObj;

	Faker fakeData = new Faker();
	String Firstname = fakeData.name().firstName();
	String Fathername = fakeData.name().lastName();
	String GrandFatherName = fakeData.name().firstName();
	String FamilyName = fakeData.name().firstName();
	// String Phone = fakeData.number().digits(10);
	String Phone = "1198563254";
	//String Phone2 = fakeData.number().digits(8);
	String Email = fakeData.internet().emailAddress();
	String Password = "Akram@1234";
	String CabNameInEnglish = fakeData.name().firstName();
	String CabNameInArabic = " يوزر ";

	@Test
	public void CreateCabUserSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.CreateAccountLink();
		AsAnonymousUserCreateCabUserPageObj = new AsAnonymousUserCreateCabUserPage(driver);
		AsAnonymousUserCreateCabUserPageObj.UserCanCreateCabUser(Firstname, Fathername, GrandFatherName, FamilyName,
				Phone, Email, Password, CabNameInEnglish, CabNameInArabic);

	}

}
