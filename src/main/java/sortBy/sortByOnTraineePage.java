package sortBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class sortByOnTraineePage extends PageBase{

	public sortByOnTraineePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;

	@FindBy(linkText = "Trainees")
	WebElement TraineeLink;

	@FindBy(id = "mat-select-0")
	WebElement SortedByDropDown;

	public void SortByRequestedOn() {
		// clickButton(UserManagementLink);
		// clickButton(EiacStaffLink);
		setTextElementText(SortedByDropDown, "Requested on");
	}

	public void SortByFullName() {
		clickButton(UserManagementLink);
		clickButton(TraineeLink);
		setTextElementText(SortedByDropDown, "Full Name");
	}
	
	

}
