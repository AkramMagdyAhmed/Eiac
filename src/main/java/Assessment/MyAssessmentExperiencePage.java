package Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class MyAssessmentExperiencePage extends PageBase {

	public MyAssessmentExperiencePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "My Assessment Experience")
	WebElement MyAssessmentExperience;

	@FindBy(linkText = "Suspended")
	WebElement SuspendedTab;

	@FindBy(linkText = " Active ")
	WebElement ActiveTab;

	@FindBy(xpath = "//*[@id=\"content\"]/app-my-assessment-exp-list/div/p")
	public WebElement Validation;

	@FindBy(css = "mat-select[class='mat-select ng-tns-c225-9 ng-tns-c91-8 ng-star-inserted']")
	WebElement SortBYDropDown;

//	@FindBy(css = "a[mattooltip='Delete']")
	@FindBy(xpath = "//*[@id=\"content\"]/app-my-profile/div/div/div/div/div/div[1]/div/div/div/div[2]/div/a")
	WebElement DeleteBtn;

	@FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/ng-component/div/div[4]/button[2]")
	WebElement YesChoice;

	@FindBy(css = "div[class='role assign ng-star-inserted']")
	WebElement AssignRoleButton;

	@FindBy(xpath = "//*[@id=\"mat-select-1\"]/div/div[1]")
	WebElement RoleDropDown;
	
	@FindBy(className = "remove-role ng-star-inserted")
	WebElement EditRoleIcon;

	public void SortByCreatedAtInActiveTab() {
		clickButton(MyAssessmentExperience);
		setTextElementText(SortBYDropDown, "Created At");
	}

	public void SortBySchemeNameInActiveTab() {
		clickButton(MyAssessmentExperience);
		setTextElementText(SortBYDropDown, "Scheme Name");
	}

	public void DeleteUserInAssessmentExperience() {
		// clickButton(MyAssessmentExperience);
		clickButton(DeleteBtn);
		clickButton(YesChoice);

	}

	public void AssignRole() {
		clickButton(AssignRoleButton);
		setTextElementText(RoleDropDown, "External Expert");
	}
	
	public void RemoveRole()
	{
		clickButton(EditRoleIcon);
		clickButton(YesChoice);
	}

}
