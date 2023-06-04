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

	@FindBy(xpath = "//*[@id=\"content\"]/app-my-profile/div/div/div/div/div/div[1]/div/div/div/div[2]/div/a")
	WebElement DeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/ng-component[1]/div[1]/div[4]/button[2]/span[1]")
	WebElement YesChoice;

	@FindBy(css = "div[class='role assign ng-star-inserted']")
	WebElement AssignRoleButton;

	@FindBy(css = "mat-select[name='selectRole']")
	WebElement RoleDropDown;
	
	@FindBy(css ="button[class='mat-focus-indicator btn-create w-100 mat-raised-button mat-button-base mat-primary']")
	WebElement ConfirmBtn;
	
	//@FindBy(className = "remove-role ng-star-inserted")
	@FindBy(css = "mat-icon[class='mat-icon notranslate material-icons mat-icon-no-color']")
	WebElement RemoveRoleIcon;
	
	@FindBy(id = "toast-container")
	public WebElement DeleteValidation;
	
	@FindBy(id = "toast-container")
	public WebElement AddValidation;
	
	//@FindBy(xpath = "/html/body/div[5]/div/div[3]/button[1]")
	@FindBy(css = "button[class='swal2-confirm swal2-styled']")
	WebElement YesDeleteItBtn;
	

	public void SortByCreatedAtInActiveTab() {
		clickButton(MyAssessmentExperience);
		setTextElementText(SortBYDropDown, "Created At");
	}

	public void SortBySchemeNameInActiveTab() {
		clickButton(MyAssessmentExperience);
		setTextElementText(SortBYDropDown, "Scheme Name");
	}

	public void DeleteUserInAssessmentExperience() throws InterruptedException {
		// clickButton(MyAssessmentExperience);
		clickButton(DeleteBtn);
		Thread.sleep(2000);
		clickButton(YesChoice);

	}

	public void AssignRole() throws InterruptedException {
		clickButton(AssignRoleButton);
		Thread.sleep(2000);
		setTextElementText(RoleDropDown, "External Expert");
		Thread.sleep(1000);
		clickButton(ConfirmBtn);
		
	}
	
	public void RemoveRole() throws InterruptedException
	{
		clickButton(RemoveRoleIcon);
		Thread.sleep(2000);
		clickButton(YesDeleteItBtn);
	}

}
