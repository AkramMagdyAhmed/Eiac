package MyProfile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class ProfessionalExperienceRecordPage  extends PageBase{

	public ProfessionalExperienceRecordPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	@FindBy(id = "userAccountDrop")
	WebElement UserAccountDropdown;

	@FindBy(linkText = "My Profile")
	WebElement MyProfileLink;

	@FindBy(xpath = "//*[@id=\"content\"]/app-my-profile/div/div/div/div/div/div[3]/div/div/div/div[1]/ul/li[7]")
	WebElement ProfessionalExperienceRecordLink;

	@FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	WebElement AddNewProfessionalExperienceRecordBtn;
	
	@FindBy(css = "input[formcontrolname='jobTitle']")
	WebElement jobTitleField;
	
	@FindBy(css = "input[formcontrolname='company']")
	WebElement companyField;
	
	@FindBy(css = "textarea[formcontrolname='dutiesAndResponsibilities']")
	WebElement DutiesAndResponsibilitiesField;
	
	//@FindBy(className = "mat-select-value ng-tns-c225-38")
	@FindBy(css = "mat-select[formcontrolname='fromMonth']")
	WebElement SelectMonth;
	
	//@FindBy(className = "mat-form-field-infix ng-tns-c91-39")
	@FindBy(css = "mat-select[formcontrolname='fromYear']")
	WebElement SelectYear;
	
	@FindBy(css = "button[class='mat-focus-indicator mat_orange-outline w-100 mat-raised-button mat-button-base']")
	WebElement SaveAndCloseBtn;
	
	@FindBy(id = "toast-container")
	public WebElement Validation;
	
	public void AddPresentPosition(String JobTitle , String Company , String DutiesAndResponsibilities) throws InterruptedException
	{
		clickButton(UserAccountDropdown);
		clickButton(MyProfileLink);
		clickButton(ProfessionalExperienceRecordLink);
		clickButton(AddNewProfessionalExperienceRecordBtn);
		setTextElementText(jobTitleField, JobTitle);
		setTextElementText(companyField, Company);
		setTextElementText(DutiesAndResponsibilitiesField, DutiesAndResponsibilities);
		setTextElementText(SelectMonth, "February");
		setTextElementText(SelectYear, "2022");
		clickButton(SaveAndCloseBtn);
		Thread.sleep(2000);
	}
	
	

}
