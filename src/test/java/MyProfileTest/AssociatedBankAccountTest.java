package MyProfileTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import MyProfile.BankAccountPage;
import userManagement.TestBase;
import userManagementPages.LoginPage;

public class AssociatedBankAccountTest extends TestBase {

	LoginPage LoginPageObj;
	BankAccountPage BankAccountPageObj;

	String Email = "Eiacstaffuser@mailinator.com";
	String Password = "Akram@1234";
	
	Faker fakeData = new Faker();
	String AccountNumber = fakeData.number().digit();
	String BankName = fakeData.name().name();
	String Iban = fakeData.number().digit();
	String SwiftCode = fakeData.number().digits(5);
	String AccountHolderName = fakeData.name().firstName();
	String BranchName = fakeData.address().cityName();

	@Test(priority= 1)

	public void LoginSuccessfully() {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
	}

//	@Test(priority = 2 , enabled = false)
//	public void AddNewAssociatedBankAccountSuccessfully() throws InterruptedException {
//		BankAccountPageObj = new BankAccountPage(driver);
//		BankAccountPageObj.AddNewAssociated(AccountNumber, BankName);
//		Assert.assertTrue(BankAccountPageObj.Validation.getText().contains("Successfully Added"));
//	}
	
	@Test(priority = 2)
	public void AddNewNotAssociatedBankAccountSuccessfully() throws InterruptedException {
		BankAccountPageObj = new BankAccountPage(driver);
		BankAccountPageObj.AddNewNotAssociated(AccountNumber, BankName, Iban, SwiftCode, AccountHolderName, BranchName);
		Assert.assertTrue(BankAccountPageObj.Validation.getText().contains("Successfully Added"));
	}

}
