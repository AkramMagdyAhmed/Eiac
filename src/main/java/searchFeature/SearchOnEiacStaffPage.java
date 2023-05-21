package searchFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class SearchOnEiacStaffPage extends PageBase{

	public SearchOnEiacStaffPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;
	
	
	@FindBy(css = "li[class='sub-menu ng-star-inserted']")
	WebElement EiacStaffLink;
	
	@FindBy(css = "button[class='mat-focus-indicator mat-icon-button mat-button-base']")
	WebElement SearchIcon;
	
    //@FindBy(className = "mat-form-field ng-tns-c91-8 mat-primary mat-form-field-type-mat-input mat-form-field-can-float ng-pristine ng-valid ng-star-inserted ng-touched")
    //@FindBy(css = "input[class='mat-input-element mat-form-field-autofill-control ng-tns-c91-8 cdk-text-field-autofill-monitored ng-pristine ng-valid ng-touched']")
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/div/div/div/app-egac-staff/div/div[2]/div[3]/form/mat-form-field/div/div[1]/div[1]/span")
	//@FindBy(id = "mat-input-2")
	//@FindBy(css = "div[class='mat-form-field-infix ng-tns-c91-8']")
	WebElement TextField;
	
	@FindBy(className = "mat-focus-indicator mat-icon-button mat-button-base")
	WebElement SearchButton;
	
	
	
	
	public void OpenSearchonEiacStaffPageinActiveTab(String Text) throws InterruptedException
	{
		clickButton(UserManagementLink);
		clickButton(EiacStaffLink);
		Thread.sleep(4000);
		clickButton(SearchIcon);
		clickButton(TextField);
		setTextElementText(TextField, Text);
		clickButton(SearchButton);
		
	}
	
//	public void OpenSearchonEiacStaffPageinInActiveTab(String Text)
//	{
//		clickButton(SearchBar);
//		setTextElementText(SearchBar, Text);
//		
//	}

}
