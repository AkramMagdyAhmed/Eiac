package searchFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class SearchOnCabUsersPage  extends PageBase{

	public SearchOnCabUsersPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;
	
	@FindBy(linkText = "CABs Users")
	WebElement CabUsersLink;
	
	@FindBy(css = "button[class='mat-focus-indicator mat-icon-button mat-button-base']")
	WebElement SearchIcon;
	
	@FindBy(css = "div[class='mat-form-field-infix ng-tns-c91-8']")
	WebElement TextField;
		
	@FindBy(className = "mat-focus-indicator mat-icon-button mat-button-base")
	WebElement SearchButton;
	
	
	public void OpenSearchonCabUsersPageinActiveTab(String Text) throws InterruptedException
	{
		clickButton(UserManagementLink);
		clickButton(CabUsersLink);
		Thread.sleep(4000);
		clickButton(SearchIcon);
		clickButton(TextField);
		Thread.sleep(2000);
		setTextElementText(TextField, Text);
		clickButton(SearchButton);
		
	}

}
