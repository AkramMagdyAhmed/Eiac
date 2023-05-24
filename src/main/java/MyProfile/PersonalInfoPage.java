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

public class PersonalInfoPage extends PageBase {

	public PersonalInfoPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}

	@FindBy(id = "userAccountDrop")
	WebElement UserAccountDropdown;

	@FindBy(linkText = "My Profile")
	WebElement MyProfileLink;

	@FindBy(css = "a[mattooltip='Edit']")
	WebElement EditButton;

	@FindBy(className = "image-preview")
	WebElement imageUpload;
	
	@FindBy(xpath = "//*[@id=\"mat-dialog-3\"]/ng-component/section/mat-dialog-content/div/form/div/div[13]/app-file-manager/div/div[1]/div[2]/label")
	WebElement UploadNationalId;
	
	@FindBy(xpath = "//*[@id=\"mat-dialog-3\"]/ng-component/section/mat-dialog-content/div/form/div/div[15]/app-file-manager/div/div[1]/div[2]/label")
	WebElement UploadPassportFile;
	

	String imageName = "Apple.jpg";
	String imagePath = System.getProperty("user.dir") + "\\Uploads\\" + imageName;

	String NationalID = "Document-Details.pdf";
	String NationalPath = System.getProperty("user.dir") + "\\Uploads\\" + NationalID;

	String PassportFile = "Document-Details.pdf";
	String PassportPath = System.getProperty("user.dir") + "\\Uploads\\" + PassportFile;

	@FindBy(css = "input[formcontrolname='firstName']")
	WebElement FirstnameField;

	@FindBy(css = "input[formcontrolname='fatherName']")
	WebElement FathernameField;

	@FindBy(css = "input[formcontrolname='grandfatherName']")
	WebElement GrandFatherNameField;

	@FindBy(css = "input[formcontrolname='familyName']")
	WebElement FamilyNameField;

	@FindBy(css = "input[formcontrolname='position']")
	WebElement PositionField;

	@FindBy(id = "phone")
	WebElement PhoneField;

	@FindBy(css = "mat-select[formcontrolname='nationality']")
	WebElement nationalityDropdown;

	@FindBy(css = "input[formcontrolname='email']")
	WebElement EmailField;

	@FindBy(css = "input[formcontrolname='email']")
	WebElement NationalIDField;

	public void EditPersonalInfo(String Firstname, String Fathername, String GrandFatherName, String FamilyName,
			String Position, String Phone, String NationalID)
			throws AWTException, InterruptedException {

		clickButton(UserAccountDropdown);
		clickButton(MyProfileLink);
		clickButton(EditButton);
		clickButton(imageUpload);
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
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		/*
		FirstnameField.clear();
		setTextElementText(FirstnameField, Firstname);
		FathernameField.clear();
		setTextElementText(FathernameField, Fathername);
		GrandFatherNameField.clear();
		setTextElementText(GrandFatherNameField, GrandFatherName);
		FamilyNameField.clear();
		setTextElementText(FamilyNameField, FamilyName);
		setTextElementText(PositionField, Position);
		PhoneField.clear();
		setTextElementText(PhoneField, Phone);
		scrollToBottom();
		
		//setTextElementText(nationalityDropdown, "Albania");
		//NationalIDField.clear();
		//setTextElementText(NationalIDField, NationalID);
		 */
		FamilyNameField.clear();
		setTextElementText(FamilyNameField, FamilyName);
		//scrollToBottomLong();
		clickButton(UploadNationalId);
		/*
		// Upload File for National
		StringSelection selectionForNational = new StringSelection(NationalPath);
		Clipboard clipboardForNational = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboardForNational.setContents(selectionForNational, null);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		// Click on CTRL + V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		*/
	}
}
