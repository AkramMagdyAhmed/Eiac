package userManagementPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewExternalStaffUsersPage extends PageBase {

	public CreateNewExternalStaffUsersPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	
	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;
	
	
	@FindBy(linkText = "External Staff")
	WebElement ExternalStaffLink;
	
	@FindBy(css = "button[class='mat-focus-indicator btn customBtn mat-raised-button mat-button-base mat-primary']")
	WebElement AddNewExternalStaffBtn;
	
	@FindBy(css = "input[formcontrolname='firstName']")
	WebElement FirstnameField;

	@FindBy(css = "input[formcontrolname='fatherName']")
	WebElement FathernameField;

	@FindBy(css = "input[formcontrolname='grandfatherName']")
	WebElement GrandFatherNameField;

	@FindBy(css = "input[formcontrolname='familyName']")
	WebElement FamilyNameField;

	@FindBy(css = "mat-select[formcontrolname='nationality']")
	WebElement nationalityDropdown;

	@FindBy(id = "phone")
	WebElement PhoneField;

	@FindBy(css = "input[formcontrolname='email']")
	WebElement EmailField;

	@FindBy(css = "input[formcontrolname='cabNameEnglish']")
	WebElement CabNameEnglishField;

	@FindBy(css = "input[formcontrolname='cabNameArabic']")
	WebElement CabNameArabicField;

	@FindBy(css = "button[class='mat-focus-indicator btn-create w-100 mat-raised-button mat-button-base mat-primary']")
	WebElement CreateAccountBtn;

	//@FindBy(className = "ng-tns-c50-20 ng-star-inserted ng-trigger ng-trigger-flyInOut ngx-toastr toast-success")
	//@FindBy(css = "div[class='ng-tns-c50-19 toast-message ng-star-inserted']")
	@FindBy(id = "toast-container")
	public WebElement Validation;
	
	public void UserCanCreateExternalStaff(String Firstname, String Fathername, String GrandFatherName,
			String FamilyName, String Position, String NationalID, String Phone, String EmailAddress)
			throws InterruptedException {
		clickButton(UserManagementLink);
		clickButton(ExternalStaffLink);
		clickButton(AddNewExternalStaffBtn);
		setTextElementText(FirstnameField, Firstname);
		setTextElementText(FathernameField, Fathername);
		setTextElementText(GrandFatherNameField, GrandFatherName);
		setTextElementText(FamilyNameField, FamilyName);
		setTextElementText(nationalityDropdown, "Albania");
		// clickButton(nationalityDropdown);
		scrollToBottomLong();
		setTextElementText(PhoneField, Phone);
		setTextElementText(EmailField, EmailAddress);
		// clickButton(Capcha);
		clickButton(CreateAccountBtn);
		Thread.sleep(3000);

	}

}
