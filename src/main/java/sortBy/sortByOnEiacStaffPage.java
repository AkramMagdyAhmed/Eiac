package sortBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class sortByOnEiacStaffPage extends PageBase {

	public sortByOnEiacStaffPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;

	@FindBy(css = "li[class='sub-menu ng-star-inserted']")
	WebElement EiacStaffLink;

	@FindBy(id = "mat-select-0")
	WebElement SortedByDropDown;

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

}
