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

public class CVPage extends PageBase {

	public CVPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	@FindBy(id = "userAccountDrop")
	WebElement UserAccountDropdown;

	@FindBy(linkText = "My Profile")
	WebElement MyProfileLink;
	
	@FindBy(xpath = "//*[@id=\"content\"]/app-my-profile/div/div/div/div/div/div[3]/div/div/div/div[1]/ul/li[10]")
	WebElement CVLink;
	
	@FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	WebElement AddNewCVBtn;
	
	@FindBy(css = "label[for='fileDropRef_0']")
	WebElement BrowseYourFilesLink;
	
	@FindBy(css = "button[class='mat-focus-indicator mat_orange w-100 mat-raised-button mat-button-base']")
	WebElement UploadBtn;
	
	@FindBy(id = "toast-container")
	public WebElement Validation;
	
	String imageName = "Apple.jpg";
	String imagePath = System.getProperty("user.dir") + "\\Uploads\\" + imageName;
	
	
	public void AddNewCv() throws InterruptedException, AWTException
	{
		clickButton(UserAccountDropdown);
		clickButton(MyProfileLink);
		Thread.sleep(1500);
		scrollToBottomLong();
		Thread.sleep(1000);
		clickButton(CVLink);
		clickButton(AddNewCVBtn);
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
		clickButton(UploadBtn);
		Thread.sleep(3000);
		
	}
	
	

}
