package MyProfile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class OtherSkills extends PageBase {

	public OtherSkills(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	
	@FindBy(id = "userAccountDrop")
	WebElement UserAccountDropdown;

	@FindBy(linkText = "My Profile")
	WebElement MyProfileLink;
	
	@FindBy(xpath = "//*[@id=\"content\"]/app-my-profile/div/div/div/div/div/div[3]/div/div/div/div[1]/ul/li[5]")
	WebElement OtherSkillsLink;
	
	@FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	WebElement AddNewOtherSkillsBtn;
	
	@FindBy(css = "input[formcontrolname='skillName']")
	WebElement SkillNameField;
	
	
	@FindBy(css = "mat-select[formcontrolname='yearsOfExp']")
	//@FindBy(id = "mat-select-1")
	WebElement YearsOfExpDropdown;
	
	@FindBy(css = "textarea[formcontrolname='description']")
	WebElement descriptionField;
	
	@FindBy(css = "textarea[formcontrolname='note']")
	WebElement noteField;
	
	@FindBy(css = "button[class='mat-focus-indicator mat_orange-outline w-100 mat-raised-button mat-button-base']")
	WebElement SaveAndCloseBtn;
	
	@FindBy(id = "toast-container")
	public WebElement Validation;
	
	public void AddOtherSkills(String SkillName , String Description , String Note )
	{
		clickButton(UserAccountDropdown);
		clickButton(MyProfileLink);
		clickButton(OtherSkillsLink);
		clickButton(AddNewOtherSkillsBtn);
		scrollToBottomLong();
		setTextElementText(SkillNameField, SkillName);
		setTextElementText(YearsOfExpDropdown,"3 Years");
//		Select select = new Select(YearsOfExpDropdown);
//		select.selectByVisibleText("3 Years");
		setTextElementText(descriptionField, Description);
		setTextElementText(noteField, Note);
		clickButton(SaveAndCloseBtn);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
