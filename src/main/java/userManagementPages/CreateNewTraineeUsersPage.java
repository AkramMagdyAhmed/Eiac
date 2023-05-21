package userManagementPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewTraineeUsersPage extends PageBase{

	public CreateNewTraineeUsersPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	
	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;
	
	
	//@FindBy(css = "li[class='sub-menu ng-star-inserted']")
	@FindBy(linkText = "Trainees")
	WebElement TraineeLink;
	
	@FindBy(css = "button[class='mat-focus-indicator btn customBtn mat-raised-button mat-button-base mat-primary']")
	WebElement AddNewTraineeUserfBtn;
	
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

	@FindBy(css = "button[class='mat-focus-indicator btn-create w-100 mat-raised-button mat-button-base mat-primary']")
	WebElement CreateAccountBtn;

	@FindBy(className = "info")
	public WebElement Validation;
	
	
	public void UserCanCreateTraineeStaff(String Firstname, String Fathername, String GrandFatherName,
			String FamilyName, String Phone , String EmaillAddress)
			throws InterruptedException {
		clickButton(UserManagementLink);
		clickButton(TraineeLink);
		clickButton(AddNewTraineeUserfBtn);
		setTextElementText(FirstnameField, Firstname);
		setTextElementText(FathernameField, Fathername);
		setTextElementText(GrandFatherNameField, GrandFatherName);
		setTextElementText(FamilyNameField, FamilyName);
		setTextElementText(nationalityDropdown, "Albania");
		scrollToBottomLong();
		setTextElementText(PhoneField, Phone);
		setTextElementText(EmailField, EmaillAddress);
		clickButton(CreateAccountBtn);
		Thread.sleep(8000);
	}
	
	
	

}
