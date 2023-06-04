package MyProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class AssessmentExperiencePage extends PageBase{

	public AssessmentExperiencePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(linkText = "Assessments Members")
	WebElement AssessmentMembersList;
	
	@FindBy(css = "a[ng-reflect-message='View']")
	WebElement ViewBtn;
	
	//@FindBy(linkText = "Suspended")
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/div/div/div/app-my-profile/div/div/div/div/div/div[3]/div/div/div/div[2]/app-assessment-exp-profile/div/div[2]/div/div[1]/div[2]")
	WebElement  SuspendedTab;
	
	@FindBy(linkText = "Active")
	WebElement   ActiveTab;
	
	@FindBy(css = "a[mattooltip='View Request']")
	WebElement ViewRequestBtn;
	
	@FindBy(css = "button[class='mat-focus-indicator view-feedback mx-1 mat-raised-button mat-button-base ng-star-inserted']")
	WebElement ViewFeedBackBtn;
	
	@FindBy(css = "a[mattooltip='Edit Assigned Role']")
	WebElement EditAssignedRoleBtn;
	
	@FindBy(css = "mat-select[name='selectRole']")
	WebElement RoleDropDown;
	
	@FindBy(css = "button[class='mat-focus-indicator btn-lg w-100 mat-raised-button mat-button-base mat-primary']")
	WebElement AssignRoleBtn;
	
	
	public void NavigateBeetweenTabs() throws InterruptedException
	{
		clickButton(AssessmentMembersList);
		clickButton(ViewBtn);
		Thread.sleep(5000);
		clickButton(SuspendedTab);
		Thread.sleep(5000);
		clickButton(ActiveTab);
	}
	
	
	public void ViewFeedBack()
	{
		clickButton(ViewRequestBtn);
		clickButton(ActiveTab);
	}
	
	

}
