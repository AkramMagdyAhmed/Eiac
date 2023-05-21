package userManagementPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EiacStaffPage extends PageBase {

	public EiacStaffPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;
	
	
	@FindBy(css = "li[class='sub-menu ng-star-inserted']")
	WebElement EiacStaffLink;

	@FindBy(css = "button[class='mat-focus-indicator btn customBtn mat-raised-button mat-button-base mat-primary']")
	WebElement AddNewEiacStaffBtn;
	
	//@FindBy(css = "a[class='mat-focus-indicator mat-icon-button mat-button-base ng-star-inserted']")
	@FindBy(css = "a[mattooltip='View']")
	WebElement ViewButton;
	
	//@FindBy(css = "a[class='mat-focus-indicator mat-icon-button mat-button-base ng-star-inserted']")
	@FindBy(xpath = "//*[@id=\"content\"]/app-egac-staff/div/div[3]/div[1]/table/tbody/tr[1]/td[5]/div/a[2]")
	WebElement DeleteButton;
	
	@FindBy(css = "button[class='mat-focus-indicator mx-2 mat-raised-button mat-button-base mat-primary']")
	WebElement YesButton;
	
	@FindBy(xpath = "//*[@id=\"html\"]/body/div[3]")
	//@FindBy(css = "div[class='toast-top-right toast-container']")
	public WebElement Validation;
	
	
	//@FindBy(className = "tab-item active")
	@FindBy(xpath = "//*[@id=\"content\"]/app-egac-staff/div/div[1]/div[4]")
	WebElement InactiveTab;
	
	
	@FindBy(xpath = "//*[@id=\"content\"]/app-egac-staff/div/div[1]/div[2]")
	WebElement NotVerifiedYetTab;
	
	
	@FindBy(xpath = "//*[@id=\"content\"]/app-egac-staff/div/div[1]/div[1]")
	WebElement AwaitingApprovaltTab;
	
	@FindBy(xpath = "//*[@id=\"content\"]/app-egac-staff/div/div[1]/div[3]")
	WebElement ActivetTab;
	
	@FindBy(id = "mat-select-0")
	WebElement SortedByDropDown;
	
	@FindBy(css = "a[mattooltip='Deactivate']")
	WebElement DeactivateButton;
	
	@FindBy(css = "a[mattooltip='Activate']")
	WebElement ActivateButton;
	
	
	@FindBy(css = "a[mattooltip='Decline']")
	WebElement DeclineButton;
	
	@FindBy(css = "a[mattooltip='Approve']")
	WebElement ApproveButton;
	
	@FindBy(css = "a[mattooltip='Resend Verification Mail']")
	WebElement ResendVerificationMailButton;
	
	@FindBy(xpath = "//*[@id=\"html\"]/body/div[3]")
	public WebElement ResendVerficationMailValidation;
	
	//@FindBy(className = "action_btn-resend ng-star-inserted")
	//@FindBy(css = "button[class='mat-focus-indicator mat-button mat-button-base']")
	@FindBy(xpath = "//*[@id=\"mat-dialog-3\"]/ng-component/div/div[3]/div[1]")
	WebElement ResendVerficationEmailButtonFromView;
	
	
	@FindBy(css = "button[class='btn dropdown-custom dropdown-toggle']")
	WebElement FilterByDropDown;
	
	@FindBy(css = "input[class='mat-input-element mat-form-field-autofill-control ng-tns-c91-2 cdk-text-field-autofill-monitored ng-valid ng-touched ng-dirty']")
	WebElement FromDate;
	
	@FindBy(css = "input[class='mat-input-element mat-form-field-autofill-control ng-tns-c91-3 cdk-text-field-autofill-monitored ng-pristine ng-valid ng-touched']")
	WebElement ToDate;
	
	@FindBy(css = "mat-select[class='mat-select ng-tns-c225-5 ng-tns-c91-4 mat-select-empty ng-untouched ng-pristine ng-valid ng-star-inserted']")
	WebElement SpecialListDropDown;
	
	
	
	public void deleteUserInActiveTab() throws InterruptedException
	{
		clickButton(UserManagementLink);
		clickButton(EiacStaffLink);
		clickButton(DeleteButton);
		clickButton(YesButton);
		Thread.sleep(4000);
	}
	
	
	public void deleteUserInInactiveTab() throws InterruptedException
	{
		//clickButton(UserManagementLink);
		//clickButton(EiacStaffLink);
		clickButton(InactiveTab);
		clickButton(DeleteButton);
		clickButton(YesButton);
		Thread.sleep(4000);
	}
	
	public void deleteUserInNotVerifiedYetTab() throws InterruptedException
	{
		//clickButton(UserManagementLink);
		//clickButton(EiacStaffLink);
		clickButton(NotVerifiedYetTab);
		clickButton(DeleteButton);
		clickButton(YesButton);
		Thread.sleep(4000);
	}
	
	public void deleteUserInAwaitingApprovaltTab() throws InterruptedException
	{
		//clickButton(UserManagementLink);
		//clickButton(EiacStaffLink);
		clickButton(AwaitingApprovaltTab);
		clickButton(DeleteButton);
		clickButton(YesButton);
		Thread.sleep(4000);
	}
	
	public void SortByMemberSince() {
		// clickButton(UserManagementLink);
		// clickButton(EiacStaffLink);
		setTextElementText(SortedByDropDown, "Member Since");
	}

	public void SortByFullName() {
		clickButton(UserManagementLink);
		clickButton(EiacStaffLink);
		setTextElementText(SortedByDropDown, "Full Name");
	}
	
	public void ActivateUser()
	{
		clickButton(UserManagementLink);
		clickButton(EiacStaffLink);
		clickButton(InactiveTab);
		clickButton(ActivateButton);
	}
	
	public void DeactivateUser()
	{
		clickButton(UserManagementLink);
		clickButton(EiacStaffLink);
		//clickButton(ActivetTab);
		clickButton(DeactivateButton);
	}
	
	public void ApproveUser() throws InterruptedException
	{
		clickButton(UserManagementLink);
		clickButton(EiacStaffLink);
		clickButton(AwaitingApprovaltTab);
		Thread.sleep(2000);
		clickButton(ApproveButton);
		Thread.sleep(2000);
	}
	
	public void DeclineUser() throws InterruptedException
	{
		clickButton(UserManagementLink);
		clickButton(EiacStaffLink);
		clickButton(AwaitingApprovaltTab);
		Thread.sleep(3000);
		clickButton(DeclineButton);
		Thread.sleep(2000);
	}
	
	
	public void ResendVerificationEmail() throws InterruptedException
	{
		clickButton(UserManagementLink);
		clickButton(EiacStaffLink);
		clickButton(NotVerifiedYetTab);
		Thread.sleep(3000);
		clickButton(ResendVerificationMailButton);
		Thread.sleep(4000);
	}
	
	public void ResendVerificationEmailFromView() throws InterruptedException
	{
		clickButton(UserManagementLink);
		clickButton(EiacStaffLink);
		clickButton(NotVerifiedYetTab);
		clickButton(ViewButton);
		Thread.sleep(3000);
		clickButton(ResendVerficationEmailButtonFromView);
		Thread.sleep(4000);
	}
	
	
	public void UserCanFilter ()
	{
		clickButton(UserManagementLink);
		clickButton(EiacStaffLink);
		clickButton(ActivetTab);
		clickButton(FromDate);
		
	}
	
	
	
	

	
	
	
}
