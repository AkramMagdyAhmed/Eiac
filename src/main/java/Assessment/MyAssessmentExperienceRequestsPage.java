package Assessment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class MyAssessmentExperienceRequestsPage extends PageBase {

	public MyAssessmentExperienceRequestsPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	@FindBy(css = "a[ng-reflect-router-link='MyAssessmentsExperienceRequest']")
	WebElement MyAssessmentExpeRequestsLink;

	@FindBy(css = "button[class='mat-focus-indicator btn customBtn mat-raised-button mat-button-base mat-primary']")
	public WebElement AddNewAssessmentExperienceBtn;

	@FindBy(xpath = "//*[@id=\"content\"]/app-assessments-experience-requests/div/p")
	public WebElement CompleteYourProfileText;

	@FindBy(css = "mat-select[formcontrolname='relatedScheme']")
	WebElement SelectSchemaDropdown;

	@FindBy(css = "mat-slide-toggle[mattooltip='This Check if you want to Apply as TeamLeader or Accreditation Committee and this will apply all Schema']")
	WebElement ForAllSchemaToggleBtn;

	@FindBy(css = "mat-select[class='mat-select ng-tns-c225-10 ng-tns-c91-9 ng-star-inserted mat-select-required ng-touched ng-dirty ng-valid']")
	WebElement RoleDropdown;

	@FindBy(css = "input[formcontrolname='numOfAssessments']")
	WebElement NumberOfAssField;

	@FindBy(css = "input[formcontrolname='numOfYears']")
	WebElement NumberOfYearsField;

	@FindBy(css = "mat-checkbox[formcontrolname='declarationApprove']")
	WebElement CheckBox;

	@FindBy(css = "button[class='mat-focus-indicator btn-create w-100 mat-raised-button mat-button-base mat-primary']")
	WebElement SubmitBtn;

	@FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/ng-component/section/mat-dialog-content/div/form/div/div[4]/div/div/div[2]/div/div[2]/app-scope-input-form/form/div[1]/mat-form-field/div/div[1]/div[2]/mat-icon")
	WebElement SelectScopeIcon;

	@FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/ng-component/section/mat-dialog-content/div/form/div/div[4]/div/div/div[2]/div/div[2]/app-scope-input-form/form/div[1]/div[1]/cdk-tree/cdk-nested-tree-node/button/span/mat-icon")
	WebElement TestingDropDownIcon;

	@FindBy(css = "div[class='mat-ripple mat-button-ripple mat-button-ripple-round']")
	WebElement ClearBtn;

	@FindBy(id = "mat-select-0")
	WebElement SortByDropdown;

	@FindBy(css = "button[class='mat-focus-indicator mat-icon-button mat-button-base']")
	WebElement SearchIcon;

	 @FindBy(css = "form[class='search-input ng-untouched ng-pristine ng-valid']")
	WebElement SearchBar;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-assessments-experience-requests[1]/div[1]/div[1]/div[3]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement SearchFoucs;
	
	@FindBy(css = "button[class='btn dropdown-custom dropdown-toggle']")
	WebElement FilterByDropDown;
	
	@FindBy(css = "svg[class='mat-datepicker-toggle-default-icon ng-star-inserted']")
	WebElement IconFromDate;
	
	//@FindBy(css = "td[aria-label='May 23, 2023']")
	@FindBy(xpath = "document.querySelector(\"td[aria-label='May 16, 2023'] div[class='mat-calendar-body-cell-content']\")")
	WebElement FromDate;
	
	@FindBy(css = "a[ng-reflect-message='View']")
	WebElement ViewBtn;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-assessments-experience-requests[1]/nav[1]/div[1]/h2[1]")
	public WebElement HeaderText;
	
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/div/div/div/app-assessments-experience-requests/div/div[2]/div[2]/mat-paginator/div/div/div[2]/button[2]")
	WebElement NextPageBtn;
	

	public void AddNewAssessmentExpRequestForAllSchema(String NumberOfAssessment, String NumberOfYears)
			throws InterruptedException {

		clickButton(MyAssessmentExpeRequestsLink);
//		try {
//			if (AddNewAssessmentExperienceBtn.isDisplayed()) {
//				AddNewAssessmentExperienceBtn.click();
//			}
//
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Profile is Not Completed");
//		}
		clickButton(AddNewAssessmentExperienceBtn);
		Thread.sleep(2000);
		clickButton(ForAllSchemaToggleBtn);
		Thread.sleep(2000);
		setTextElementText(RoleDropdown, "Team Leader");
		setTextElementText(NumberOfAssField, NumberOfAssessment);
		setTextElementText(NumberOfYearsField, NumberOfYears);
		clickButton(CheckBox);
		Thread.sleep(3000);
	}

	public void AddNewAssessmentExpReqForSpecificScope() throws InterruptedException {
		clickButton(MyAssessmentExpeRequestsLink);
		clickButton(AddNewAssessmentExperienceBtn);
		setTextElementText(SelectSchemaDropdown, "Testing Labs");
		Thread.sleep(2000);
		clickButton(SelectScopeIcon);
		Thread.sleep(2000);
		clickButton(TestingDropDownIcon);
		Thread.sleep(2000);
	}

	public void ProfileNotCompleted() throws InterruptedException {

		clickButton(MyAssessmentExpeRequestsLink);
		Thread.sleep(2000);
	}

	public void ClearDataInForm(String NumberOfAssessment, String NumberOfYears) throws InterruptedException {
		clickButton(MyAssessmentExpeRequestsLink);
		clickButton(AddNewAssessmentExperienceBtn);
		Thread.sleep(2000);
		// clickButton(ForAllSchemaToggleBtn);
		// setTextElementText(SelectSchemaDropdown, "Testing Labs");
		setTextElementText(NumberOfAssField, NumberOfAssessment);
		setTextElementText(NumberOfYearsField, NumberOfYears);
		clickButton(ClearBtn);
	}

	public void SortByRequestedOn() throws InterruptedException {
		clickButton(MyAssessmentExpeRequestsLink);
		Thread.sleep(2000);
		setTextElementText(SortByDropdown, "Scheme Name");
		Thread.sleep(3000);
		setTextElementText(SortByDropdown, "Requested on");
		Thread.sleep(3000);
	}
	public void Search(String Assessment) throws InterruptedException {
		clickButton(MyAssessmentExpeRequestsLink);
		clickButton(SearchIcon);
		Thread.sleep(2000);
		clickButton(SearchBar);
		Thread.sleep(2000);
		setTextElementText(SearchFoucs, Assessment);
	}
	
	public void FilterBy() throws InterruptedException
	{
		clickButton(MyAssessmentExpeRequestsLink);
		clickButton(FilterByDropDown);
		clickButton(IconFromDate);
		setTextElementText(FromDate,"5/30/2023");
		//clickButton(FromDate);
		Thread.sleep(3000);
	}
	
	public void ViewAssessment() throws InterruptedException
	{
		clickButton(MyAssessmentExpeRequestsLink);
		clickButton(ViewBtn);
		Thread.sleep(2000);
	}
	
	public void VerifyPagination() throws InterruptedException
	{
		clickButton(MyAssessmentExpeRequestsLink);
		Thread.sleep(3000);
		scrollToBottomLong();
		Thread.sleep(2000);
		clickButton(NextPageBtn);
	}
}
