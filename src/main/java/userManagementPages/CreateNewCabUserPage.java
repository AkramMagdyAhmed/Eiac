package userManagementPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCabUserPage extends PageBase {

	public CreateNewCabUserPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;
	

	//@FindBy(css = "li[class='sub-menu ng-star-inserted']")
	@FindBy(linkText = "CABs Users")
	WebElement CabUsersLink;
	
	@FindBy(css = "button[class='mat-focus-indicator btn customBtn mat-raised-button mat-button-base mat-primary']")
	//@FindBy(linkText = "Add New CAB User")
	WebElement AddNewCabUserBtn;
	
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

	@FindBy(css = "input[formcontrolname='password']")
	WebElement PasswordField;

	@FindBy(css = "input[formcontrolname='cabNameEnglish']")
	WebElement CabNameEnglishField;

	@FindBy(css = "input[formcontrolname='cabNameArabic']")
	WebElement CabNameArabicField;

	@FindBy(css = "button[class='mat-focus-indicator btn-create w-100 mat-raised-button mat-button-base mat-primary']")
	WebElement CreateAccountBtn;

	@FindBy(className = "info")
	public WebElement Validation;
	
	
	public void UserCanCreateCabUser(String Firstname, String Fathername, String GrandFatherName, String FamilyName,
			String Phone, String CabNameInEnglish, String CabNameInArabic , String EmailAddress)
			throws InterruptedException 
	{
		clickButton(UserManagementLink);
		clickButton(CabUsersLink);
		clickButton(AddNewCabUserBtn);
		setTextElementText(FirstnameField, Firstname);
		setTextElementText(FathernameField, Fathername);
		setTextElementText(GrandFatherNameField, GrandFatherName);
		setTextElementText(FamilyNameField, FamilyName);
		setTextElementText(nationalityDropdown, "Albania");
		setTextElementText(PhoneField, Phone);
		setTextElementText(EmailField, EmailAddress);
		scrollToBottomLong();
		setTextElementText(CabNameEnglishField, CabNameInEnglish);
		setTextElementText(CabNameArabicField, CabNameInArabic);
		clickButton(CreateAccountBtn);
		Thread.sleep(8000);
	
	}
}
