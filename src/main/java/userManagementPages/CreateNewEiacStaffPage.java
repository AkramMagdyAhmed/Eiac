package userManagementPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewEiacStaffPage extends PageBase {

	public CreateNewEiacStaffPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;
	
	
	@FindBy(css = "li[class='sub-menu ng-star-inserted']")
	WebElement EiacStaffLink;
	
	@FindBy(css = "button[class='mat-focus-indicator btn customBtn mat-raised-button mat-button-base mat-primary']")
	WebElement AddNewEiacStaffBtn;
	
	
	@FindBy(css = "input[formcontrolname='firstName']")
	WebElement FirstnameField;

	@FindBy(css = "input[formcontrolname='fatherName']")
	WebElement FathernameField;

	@FindBy(css = "input[formcontrolname='grandfatherName']")
	WebElement GrandFatherNameField;

	@FindBy(css = "input[formcontrolname='familyName']")
	WebElement FamilyNameField;

	@FindBy(css = "input[formcontrolname='position']")
	WebElement PositionField;

	@FindBy(css = "mat-select[formcontrolname='nationality']")
	WebElement nationalityDropdown;

	@FindBy(css = "input[formcontrolname='nationalId']")
	WebElement NationalIDfield;

	@FindBy(id = "phone")
	WebElement PhoneField;

	@FindBy(css = "input[formcontrolname='email']")
	WebElement EmailField;

	@FindBy(css = "input[formcontrolname='password']")
	WebElement PasswordField;

	@FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]/div[1]")
	WebElement Capcha;

	@FindBy(css = "button[class='mat-focus-indicator btn-create w-100 mat-raised-button mat-button-base mat-primary']")
	WebElement CreateAccountBtn;

	@FindBy(xpath = "//*[@id=\"html\"]/body/div[3]")
	//@FindBy(css = "div[class='toast-top-right toast-container']")
	public WebElement Validation;

	public void ExecutiveDirectorUserCanCreateEiacStaff(String Firstname, String Fathername, String GrandFatherName, String FamilyName,
			String Position, String Phone, String EmailAddress)
			throws InterruptedException {
		clickButton(UserManagementLink);
		clickButton(EiacStaffLink);
		clickButton(AddNewEiacStaffBtn);
		setTextElementText(FirstnameField, Firstname);
		setTextElementText(FathernameField, Fathername);
		setTextElementText(GrandFatherNameField, GrandFatherName);
		setTextElementText(FamilyNameField, FamilyName);
		setTextElementText(PositionField, Position);
		setTextElementText(nationalityDropdown, "Albania");
		setTextElementText(PhoneField, Phone);
		setTextElementText(EmailField, EmailAddress);
		scrollToBottomLong();
		// clickButton(Capcha);
		clickButton(CreateAccountBtn);
		Thread.sleep(2000);

	}

	

}
