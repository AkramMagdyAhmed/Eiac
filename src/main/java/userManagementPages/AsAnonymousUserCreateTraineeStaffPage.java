package userManagementPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AsAnonymousUserCreateTraineeStaffPage extends PageBase {

	public AsAnonymousUserCreateTraineeStaffPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	@FindBy(css = "mat-radio-button[class='mat-radio-button form-group type-selector_item LY8ppWRSWvldkKkgl70YiTNeBiiOFJ mat-accent ng-star-inserted")
	WebElement TraineeStaffChoice;

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

	@FindBy(css = "mat-select[formcontrolname='nationality']")
	WebElement nationalityDropdown;
	
	@FindBy(id = "phone")
	WebElement PhoneField;

	@FindBy(css = "input[formcontrolname='email']")
	WebElement EmailField;

	@FindBy(css = "input[formcontrolname='password']")
	WebElement PasswordField;

	@FindBy(css = "button[class='mat-focus-indicator btn-create w-100 mat-raised-button mat-button-base mat-primary']")
	WebElement CreateAccountBtn;

	@FindBy(className = "info")
	public WebElement Validation;
	
	
	public void UserCanCreateTraineeStaff(String Firstname, String Fathername, String GrandFatherName,
			String FamilyName, String Phone, String Email, String Password)
			throws InterruptedException {
		clickButton(TraineeStaffChoice);
		clickButton(ContinueBtn);
		setTextElementText(FirstnameField, Firstname);
		setTextElementText(FathernameField, Fathername);
		setTextElementText(GrandFatherNameField, GrandFatherName);
		setTextElementText(FamilyNameField, FamilyName);
		setTextElementText(nationalityDropdown, "Albania");
		scrollToBottomLong();
		setTextElementText(PhoneField, Phone);
		setTextElementText(EmailField, Email);
		setTextElementText(PasswordField, Password);
		clickButton(CreateAccountBtn);
		Thread.sleep(8000);
	
	}

}
