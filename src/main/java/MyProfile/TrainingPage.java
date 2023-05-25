package MyProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class TrainingPage extends PageBase {

	public TrainingPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id = "userAccountDrop")
	WebElement UserAccountDropdown;

	@FindBy(linkText = "My Profile")
	WebElement MyProfileLink;

	@FindBy(xpath = "//*[@id=\"content\"]/app-my-profile/div/div/div/div/div/div[3]/div/div/div/div[1]/ul/li[8]")
	WebElement TrainingLink;

	@FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	WebElement AddNewTrainingBtn;
	
	@FindBy(css = "input[formcontrolname='courseTitle']")
	WebElement CourseTitleField;
	
	@FindBy(css = "input[formcontrolname='organizationInstitute']")
	WebElement OrganizationInstituteField;
	
	@FindBy(css = "input[formcontrolname='fromDate']")
	WebElement fromDate;
	
	@FindBy(css = "input[formcontrolname='toDate']")
	WebElement toDate;
	
	@FindBy(css = "label[for='fileDropRef_0']")
	WebElement BrowseYourFilesLink;
	
	@FindBy(css = "button[class='mat-focus-indicator mat_orange-outline w-100 mat-raised-button mat-button-base']")
	WebElement SaveAndCloseBtn;
	
	
	
	public void AddNewTraining(String CourseTitle , String OrganizationInstitute)
	{
		clickButton(UserAccountDropdown);
		clickButton(MyProfileLink);
		clickButton(TrainingLink);
		clickButton(AddNewTrainingBtn);
		
	}
	
	
	
	
	
	
	 

}
