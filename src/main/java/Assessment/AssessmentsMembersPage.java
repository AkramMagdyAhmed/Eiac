package Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class AssessmentsMembersPage extends PageBase {

	public AssessmentsMembersPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Assessments Members")
	WebElement AssessmentsMembersLink;
	
	@FindBy(css = "a[ng-reflect-message='View']")
	WebElement ViewBtn;
	
	
	public void ViewMember()
	{
		clickButton(AssessmentsMembersLink);
		clickButton(ViewBtn);
	}
	
	
	
	
	
	

}
