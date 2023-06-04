package MyProfile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import userManagementPages.PageBase;

public class EducationPage extends PageBase {

	public EducationPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}

	@FindBy(id = "userAccountDrop")
	WebElement UserAccountDropdown;

	@FindBy(linkText = "My Profile")
	WebElement MyProfileLink;

	// @FindBy(linkText = "Education")
	@FindBy(xpath = "//*[@id=\"content\"]/app-my-profile/div/div/div/div/div/div[3]/div/div/div/div[1]/ul/li[3]")
	WebElement EducationLink;

	@FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	// @FindBy(linkText = "Add Education")
	WebElement AddNewEducationBtn;

	@FindBy(css = "input[formcontrolname='institute']")
	WebElement InstituteField;

	@FindBy(css = "mat-select[formcontrolname='certificate']")
	WebElement CertificateDropDown;

	@FindBy(css = "input[formcontrolname='major']")
	WebElement majorField;

	@FindBy(css = "mat-select[formcontrolname='startYear']")
	WebElement startYearField;

	@FindBy(css = "mat-select[formcontrolname='endYear']")
	WebElement endYearField;

	// @FindBy(linkText = " Browse Your Files ")
	// @FindBy(xpath =
	// "//*[@id=\"mat-dialog-1\"]/ng-component/section/mat-dialog-content/div/form/div/div[5]/app-file-manager/div/div[1]/div[2]/label")
	@FindBy(css = "label[for='fileDropRef_0']")
	WebElement BrowseYourFilesLink;

	@FindBy(css = "label[for='fileDropRef_0']")
	WebElement SaveAndCloseBtn;

	String imageName = "Apple.jpg";
	String imagePath = System.getProperty("user.dir") + "\\Uploads\\" + imageName;

	public void AddEducation(String Institute, String major) throws InterruptedException, AWTException {
		clickButton(UserAccountDropdown);
		clickButton(MyProfileLink);
		clickButton(EducationLink);
		clickButton(AddNewEducationBtn);
		setTextElementText(InstituteField, Institute);
		setTextElementText(CertificateDropDown, "Dip");
		setTextElementText(majorField, major);
		setTextElementText(startYearField, "2022");
		setTextElementText(endYearField, "2023");
		Thread.sleep(2000);
		scrollToBottomLong();
		
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(imagePath);
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
		Thread.sleep(3000);
	}
}
