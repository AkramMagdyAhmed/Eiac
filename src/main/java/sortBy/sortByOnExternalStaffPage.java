package sortBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class sortByOnExternalStaffPage extends PageBase {

	public sortByOnExternalStaffPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;

	@FindBy(linkText = "External Staff")
	WebElement ExternalStaffLink;

	@FindBy(id = "mat-select-0")
	WebElement SortedByDropDown;

	public void SortByRequestedOn() {
		// clickButton(UserManagementLink);
		// clickButton(EiacStaffLink);
		setTextElementText(SortedByDropDown, "Requested on");
	}

	public void SortByFullName() {
		clickButton(UserManagementLink);
		clickButton(ExternalStaffLink);
		setTextElementText(SortedByDropDown, "Full Name");
	}

}
