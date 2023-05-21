package userManagementPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

public class AsAnonymousUserCreateEiacStaff extends PageBase {

	public AsAnonymousUserCreateEiacStaff(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}

	@FindBy(css = "mat-radio-button[class='mat-radio-button form-group type-selector_item LY8ppWRSWvAmbKiSo70YiTNePiiOFF mat-accent ng-star-inserted']")
	WebElement EiacStaffChoice;

	@FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/ng-component/mat-dialog-content/div/app-type-selector/form/div[3]/button")
	WebElement ContinueBtn;

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

	@FindBy(className = "info")
	public WebElement Validation;

	public void UserCanCreateEiacStaff(String Firstname, String Fathername, String GrandFatherName, String FamilyName,
			String Position, String NationalID, String Phone, String Email, String Password)
			throws InterruptedException {
		clickButton(EiacStaffChoice);
		clickButton(ContinueBtn);
		setTextElementText(FirstnameField, Firstname);
		setTextElementText(FathernameField, Fathername);
		setTextElementText(GrandFatherNameField, GrandFatherName);
		setTextElementText(FamilyNameField, FamilyName);
		setTextElementText(PositionField, Position);
		setTextElementText(nationalityDropdown, "Albania");
		scrollToBottomLong();
		setTextElementText(PhoneField, Phone);
		setTextElementText(NationalIDfield, NationalID);
		setTextElementText(EmailField, Email);
		setTextElementText(PasswordField, Password);
		// clickButton(Capcha);
		Thread.sleep(8000);
		clickButton(CreateAccountBtn);
		Thread.sleep(8000);

	}

}
