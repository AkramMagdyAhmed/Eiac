package Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class AllAssessmentExperienceRequestsPage extends PageBase {

	public AllAssessmentExperienceRequestsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "a[ng-reflect-router-link='AllAssessmentsExperienceReques']")
	WebElement AllAssessmentsExperienceRequesLink;
	
	@FindBy(id = "mat-select-0")
	WebElement SortByDropdown;
	
	@FindBy(css = "button[class='mat-focus-indicator mat-icon-button mat-button-base']")
	WebElement SearchIcon;

	 @FindBy(css = "form[class='search-input ng-untouched ng-pristine ng-valid']")
	WebElement SearchBar;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-all-assessments-exp-requests[1]/div[1]/div[1]/div[3]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement SearchFoucs;
	
	@FindBy(css = "a[ng-reflect-message='View']")
	WebElement ViewBtn;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-assessments-experience-requests[1]/nav[1]/div[1]/h2[1]")
	public WebElement HeaderText;
	
	
	
	

	public void SortByRequestedOn() throws InterruptedException {
		clickButton(AllAssessmentsExperienceRequesLink);
		Thread.sleep(2000);
		setTextElementText(SortByDropdown, "Scheme Name");
		Thread.sleep(3000);
		setTextElementText(SortByDropdown, "Requested on");
		Thread.sleep(3000);
	}
	
	public void Search(String Assessment) throws InterruptedException {
		clickButton(AllAssessmentsExperienceRequesLink);
		clickButton(SearchIcon);
		Thread.sleep(2000);
		clickButton(SearchBar);
		Thread.sleep(2000);
		setTextElementText(SearchFoucs, Assessment);
	}
	
	public void ViewAssessment() throws InterruptedException
	{
		clickButton(AllAssessmentsExperienceRequesLink);
		clickButton(ViewBtn);
		Thread.sleep(2000);
	}
	

}
