package MyProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class LanguageSkillsPage extends PageBase{

	public LanguageSkillsPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id = "userAccountDrop")
	WebElement UserAccountDropdown;

	@FindBy(linkText = "My Profile")
	WebElement MyProfileLink;
	
	//@FindBy(linkText = " Language Skills ")
	@FindBy(xpath = "//*[@id=\"content\"]/app-my-profile/div/div/div/div/div/div[3]/div/div/div/div[1]/ul/li[4]")
	WebElement LanguageSkillsLink;
	
	@FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	WebElement AddNewLanguageBtn;
	
	//@FindBy(css = "input[formcontrolname='language']")
	@FindBy(id = "mat-select-0")
	WebElement LanguageDropdown;
	
	@FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/ng-component/section/mat-dialog-content/div/form/div/div[2]/div/div[1]/div/div[2]/ngb-rating/span[2]/span")
	WebElement BeginnerChoiceOnReading;
	
	@FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/ng-component/section/mat-dialog-content/div/form/div/div[2]/div/div[3]/div/div[2]/ngb-rating/span[2]/span")
	WebElement BeginnerChoiceOnListening;
	
	@FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/ng-component/section/mat-dialog-content/div/form/div/div[2]/div/div[2]/div/div[2]/ngb-rating/span[2]/span")
	WebElement BeginnerChoiceOnWriting;
	
	@FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/ng-component/section/mat-dialog-content/div/form/div/div[2]/div/div[4]/div/div[2]/ngb-rating/span[2]/span")
	WebElement BeginnerChoiceOnSpeaking;
	
	@FindBy(css = "button[class='mat-focus-indicator mat_orange-outline w-100 mat-raised-button mat-button-base']")
	WebElement SaveAndCloseBtn;
	
	@FindBy(id = "toast-container")
	public WebElement Validation;
	
	
	public void AddLanguageSkills()
	{
		clickButton(UserAccountDropdown);
		clickButton(MyProfileLink);
		clickButton(LanguageSkillsLink);
		clickButton(AddNewLanguageBtn);
		setTextElementText(LanguageDropdown, "English");
		clickButton(BeginnerChoiceOnReading);
		clickButton(BeginnerChoiceOnListening);
		clickButton(BeginnerChoiceOnSpeaking);
		clickButton(BeginnerChoiceOnWriting);
		clickButton(SaveAndCloseBtn);
	}	
}
