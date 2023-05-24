package MyProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class LanguageSkillsPage extends PageBase{

	public LanguageSkillsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	WebElement AddNewLanguageBtn;
	
	
	@FindBy(css = "input[formcontrolname='language']")
	WebElement LanguageDropdown;
	
	
	@FindBy(css = "input[aria-describedby='cdk-describedby-message-36']")
	WebElement BeginnerChoiceOnReading;
	
	@FindBy(css = "input[aria-describedby='cdk-describedby-message-54']")
	WebElement BeginnerChoiceOnListening;
	
//	@FindBy(css = "input[aria-describedby='cdk-describedby-message-54']")
//	WebElement BeginnerChoiceOnListening;
	
	
	public void AddLanguageSkills()
	{
		clickButton(AddNewLanguageBtn);
		setTextElementText(LanguageDropdown, "English");
		clickButton(BeginnerChoiceOnReading);
		clickButton(BeginnerChoiceOnListening);
	}
	
	
	
	
}
