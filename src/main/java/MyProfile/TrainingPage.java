package MyProfile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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

	@FindBy(css = "svg[class='mat-datepicker-toggle-default-icon ng-star-inserted']")
	WebElement fromDate;

	@FindBy(xpath = "//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[3]/td[3]")
	WebElement DateSelectionInFrom;

	@FindBy(css = "button[class='mat-focus-indicator mat-icon-button mat-button-base']")
	WebElement toDate;

	@FindBy(xpath = "//*[@id=\"mat-datepicker-1\"]/div/mat-month-view/table/tbody/tr[5]/td[2]")
	WebElement DateSelectionInTo;

	@FindBy(css = "label[for='fileDropRef_0']")
	WebElement BrowseYourFilesLink;

	@FindBy(css = "button[class='mat-focus-indicator mat_orange-outline w-100 mat-raised-button mat-button-base']")
	WebElement SaveAndCloseBtn;

	@FindBy(id = "toast-container")
	public WebElement Validation;

	String imageName = "Apple.jpg";
	String imagePath = System.getProperty("user.dir") + "\\Uploads\\" + imageName;

	public void AddNewTraining(String CourseTitle, String OrganizationInstitute)
			throws InterruptedException, AWTException {
		clickButton(UserAccountDropdown);
		clickButton(MyProfileLink);
		clickButton(TrainingLink);
		clickButton(AddNewTrainingBtn);
		setTextElementText(CourseTitleField, CourseTitle);
		setTextElementText(OrganizationInstituteField, OrganizationInstitute);
		clickButton(fromDate);
		Thread.sleep(2000);
		clickButton(DateSelectionInFrom);
		clickButton(toDate);
		Thread.sleep(2000);
		clickButton(DateSelectionInTo);
		Thread.sleep(2000);
		clickButton(BrowseYourFilesLink);
		Thread.sleep(2000);
		Robot robot = new Robot();
		// CTRL + C copy image path
		StringSelection selection = new StringSelection(imagePath);
		System.out.println(imagePath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, null);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		// Click on CTRL + V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		clickButton(SaveAndCloseBtn);
	}

}
