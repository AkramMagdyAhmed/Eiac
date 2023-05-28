package MyProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class BankAccountPage extends PageBase {

	public BankAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "userAccountDrop")
	WebElement UserAccountDropdown;

	@FindBy(linkText = "My Profile")
	WebElement MyProfileLink;

	@FindBy(xpath = "//*[@id=\"content\"]/app-my-profile/div/div/div/div/div/div[3]/div/div/div/div[1]/ul/li[9]")
	WebElement BankAccountLink;

	@FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	WebElement AddNewBankAccountBtn;

	@FindBy(css = "input[formcontrolname='accountNumber']")
	WebElement AccountNumberField;

	@FindBy(css = "input[formcontrolname='bankName']")
	WebElement BankNameField;

	@FindBy(css = "mat-radio-button[class='mat-radio-button form-group category-selector_item mat-accent']")
	WebElement NotAssociatedTab;

	@FindBy(css = "input[formcontrolname='iban']")
	WebElement IbanField;

	@FindBy(css = "input[formcontrolname='swiftCode']")
	WebElement SwiftCodeField;

	@FindBy(css = "input[formcontrolname='accountHolderName']")
	WebElement AccountHolderNameField;

	@FindBy(css = "input[formcontrolname='branchName']")
	WebElement BranchNameField;

	@FindBy(css = "button[class='mat-focus-indicator mat_orange-outline w-100 mat-raised-button mat-button-base']")
	WebElement SaveAndCloseBtn;

	@FindBy(id = "toast-container")
	public WebElement Validation;

	public void AddNewAssociated(String AccountNumber, String BankName) throws InterruptedException {
		clickButton(UserAccountDropdown);
		clickButton(MyProfileLink);
		clickButton(BankAccountLink);
		clickButton(AddNewBankAccountBtn);
		setTextElementText(AccountNumberField, AccountNumber);
		setTextElementText(BankNameField, BankName);
		clickButton(SaveAndCloseBtn);
		Thread.sleep(2000);
	}

	public void AddNewNotAssociated(String AccountNumber, String BankName,String Iban,String SwiftCode , String AccountHolderName,String BranchName) throws InterruptedException {
		clickButton(UserAccountDropdown);
		clickButton(MyProfileLink);
		clickButton(BankAccountLink);
		clickButton(AddNewBankAccountBtn);
		clickButton(NotAssociatedTab);
		setTextElementText(IbanField, Iban);
		setTextElementText(AccountNumberField, AccountNumber);
		setTextElementText(SwiftCodeField, SwiftCode);
		setTextElementText(AccountHolderNameField, AccountHolderName);
		setTextElementText(BankNameField, BankName);
		setTextElementText(BranchNameField, BranchName);
		clickButton(SaveAndCloseBtn);
		Thread.sleep(2000);
	}
}
