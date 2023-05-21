package userManagementPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class deleteEiacStaff extends PageBase{

	public deleteEiacStaff(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;
	
	
	@FindBy(css = "li[class='sub-menu ng-star-inserted']")
	WebElement EiacStaffLink;
	
	
	@FindBy(css = "a[class='mat-focus-indicator mat-icon-button mat-button-base ng-star-inserted']")
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

}
