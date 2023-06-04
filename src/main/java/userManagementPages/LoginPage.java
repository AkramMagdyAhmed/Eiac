package userManagementPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "input[formcontrolname='email']")
	WebElement EmailField;

	@FindBy(css = "input[formcontrolname='password']")
	WebElement PasswordField;

	@FindBy(css = "button[class='mat-focus-indicator password-visibility mat-icon-button mat-button-base ng-tns-c91-1']")
	WebElement ShowPasswordIcon;

	@FindBy(css = "button[class='mat-focus-indicator w-100 mat-raised-button mat-button-base mat-primary']")
	WebElement LoginBtn;

	@FindBy(linkText = "Forgot password? ")
	WebElement ForgetPasswordLink;

	@FindBy(css = "span[class='create-title']")
	WebElement CreateAccountLink;

	public void UserCanLogin(String Email, String Password) {
		setTextElementText(EmailField, Email);
		setTextElementText(PasswordField, Password);
		clickButton(ShowPasswordIcon);
		clickButton(LoginBtn);
	}

	public void CreateAccountLink() throws InterruptedException {
		Thread.sleep(3000);
		clickButton(CreateAccountLink);

	}
	
	public void AMUserCanLogin(String AMEmail, String AMPassword) {
		setTextElementText(EmailField, AMEmail);
		setTextElementText(PasswordField, AMPassword);
		//clickButton(ShowPasswordIcon);
		clickButton(LoginBtn);
	}
	
	public void ADUserCanLogin(String ADEmail, String ADPassword) {
		setTextElementText(EmailField, ADEmail);
		setTextElementText(PasswordField, ADPassword);
		//clickButton(ShowPasswordIcon);
		clickButton(LoginBtn);
	}
	
	
	public void EDUserCanLogin(String EDEmail, String EDPassword) {
		setTextElementText(EmailField, EDEmail);
		setTextElementText(PasswordField, EDPassword);
		//clickButton(ShowPasswordIcon);
		clickButton(LoginBtn);
	}
	
	
	
	
}
