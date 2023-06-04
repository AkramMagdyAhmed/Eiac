package Assessment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class AllAssessmentExperienceRequestsPage extends PageBase {

	public AllAssessmentExperienceRequestsPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
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

	@FindBy(css = "button[class='btn dropdown-custom dropdown-toggle']")
	WebElement FilterByDropDown;
	
	@FindBy(css = "svg[class='mat-datepicker-toggle-default-icon ng-star-inserted']")
	WebElement IconFromDate;

	@FindBy(xpath = "//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[5]/td[4]/div")
	WebElement FromDate;
	
	@FindBy(xpath = "//*[@id=\"content\"]/app-all-assessments-exp-requests/div/div[1]/div[4]/div/div[2]/mat-form-field/div/div[1]/div[4]")
	WebElement IconToDate;
	
	@FindBy(xpath = "//*[@id=\"mat-datepicker-1\"]/div/mat-month-view/table/tbody/tr[6]/td[4]/div")
	WebElement ToDate;
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/div/div/div/app-all-assessments-exp-requests/div/div[2]/div[2]/mat-paginator/div/div/div[2]/button[2]")
	WebElement NextPageBtn;
	
	@FindBy(css = "textarea[formcontrolname='feedback']")
	WebElement FeedbackField;
	
	@FindBy(css = "textarea[formcontrolname='feedbackForAssessors']")
	WebElement FeedbackForAssessorField;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-all-assessment-exp-requests-details[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
	WebElement ViewFeedbackBtn;
	
	@FindBy(xpath = "//*[@id=\"content\"]/app-all-assessments-exp-requests/div/div[2]/div[1]/table/tbody/tr[1]/td[3]/div")
	public WebElement  WaitingMyDicision; 
	
	@FindBy(xpath = "//*[@id=\"content\"]/app-all-assessment-exp-requests-details/div/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[6]/div")
	public WebElement WaitingAccreditationDirectorDecisionnStatus;
	
	@FindBy(xpath = "//*[@id=\"content\"]/app-all-assessment-exp-requests-details/div/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[5]/div")
	public WebElement WaitingExecutiveDirectorDecisionnStatus;
	
	@FindBy(xpath = "//*[@id=\"content\"]/app-all-assessment-exp-requests-details/div/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[7]/div")
	public WebElement ApprovedStatus;
	
	//@FindBy(linkText = "Submit Decision")
     //@FindBy(css = ".mat-focus-indicator.submit-decision.mx-1.mat-raised-button.mat-button-base.cdk-focused.cdk-mouse-focused")
	//@FindBy(className = "requestDetails_header-action")
	@FindBy(xpath = "\"Submit Decision\"")
	WebElement  SubmitDecisionBtn; 
	
	@FindBy(css = "a[mattooltip='Approve']")
	WebElement ApproveBtn;
	
	@FindBy(css = "button[class='mat-focus-indicator btn-create w-100 mat-raised-button mat-button-base mat-primary']")
	WebElement ConBtn;
	
	@FindBy(css = "a[mattooltip='Decline']")
	WebElement PermanentlyDecline;
	
	@FindBy(css = "a[mattooltip='decline']")
	WebElement TemporaryDecline;
	
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

	public void ViewAssessment() throws InterruptedException {
		clickButton(AllAssessmentsExperienceRequesLink);
		clickButton(ViewBtn);
		Thread.sleep(2000);
	}

	public void FilterBy() throws InterruptedException {
		clickButton(AllAssessmentsExperienceRequesLink);
		clickButton(FilterByDropDown);
		clickButton(IconFromDate);
		Thread.sleep(2000);
		clickButton(FromDate);
		Thread.sleep(1000);
		clickButton(IconToDate);
		Thread.sleep(1000);
		clickButton(ToDate);
		Thread.sleep(3000);
	}
	
	public void VerifyPagination() throws InterruptedException
	{
		clickButton(AllAssessmentsExperienceRequesLink);
		Thread.sleep(3000);
		scrollToBottomLong();
		Thread.sleep(2000);
		clickButton(NextPageBtn);
	}
	
	public void ApproveAssessmentFromAccreditationManager(String Feedback) throws InterruptedException
	{
		clickButton(AllAssessmentsExperienceRequesLink);
		Thread.sleep(1000);
		clickButton(ViewBtn);
		Thread.sleep(5000);
		clickButton(SubmitDecisionBtn);
		Thread.sleep(1000);
		clickButton(ApproveBtn);
		Thread.sleep(1000);
		clickButton(ConBtn);
		setTextElementText(FeedbackField, Feedback);
	}
	
	
	public void ApproveAssessmentFromAccreditationDirector(String Feedback) throws InterruptedException
	{
		clickButton(AllAssessmentsExperienceRequesLink);
		Thread.sleep(1000);
		clickButton(ViewBtn);
		Thread.sleep(5000);
		clickButton(SubmitDecisionBtn);
		Thread.sleep(1000);
		clickButton(ApproveBtn);
		Thread.sleep(1000);
		clickButton(ConBtn);
		setTextElementText(FeedbackField, Feedback);
	}
	
	public void ApproveAssessmentFromExecutiveDirector(String Feedback , String FeedbackForAssesor) throws InterruptedException
	{
		clickButton(AllAssessmentsExperienceRequesLink);
		Thread.sleep(1000);
		clickButton(ViewBtn);
		Thread.sleep(5000);
		clickButton(SubmitDecisionBtn);
		Thread.sleep(1000);
		clickButton(ApproveBtn);
		Thread.sleep(1000);
		clickButton(ConBtn);
		setTextElementText(FeedbackField, Feedback);
		setTextElementText(FeedbackForAssessorField, FeedbackForAssesor);
	}
	
	
	public void PermanentlyDeclineAssessmentFromAccManagerUser() throws InterruptedException
	{
		clickButton(AllAssessmentsExperienceRequesLink);
		Thread.sleep(1000);
		clickButton(ViewBtn);
		Thread.sleep(5000);
		clickButton(SubmitDecisionBtn);
		Thread.sleep(1000);
		clickButton(PermanentlyDecline);
		Thread.sleep(1000);
		clickButton(ConBtn);
	}
	
	public void TemporaryDeclineAssessmentFromAccManagerUser() throws InterruptedException
	{
		clickButton(AllAssessmentsExperienceRequesLink);
		Thread.sleep(1000);
		clickButton(ViewBtn);
		Thread.sleep(5000);
		clickButton(SubmitDecisionBtn);
		Thread.sleep(1000);
		clickButton(TemporaryDecline);
		Thread.sleep(1000);
		clickButton(ConBtn);
		System.out.println(ConBtn.getText());
	}
	
	public void ViewFeedback() throws InterruptedException
	{
		//clickButton(AllAssessmentsExperienceRequesLink);
		//clickButton(ViewBtn);
		clickButton(ViewFeedbackBtn);
		Thread.sleep(2000);
	}
}
