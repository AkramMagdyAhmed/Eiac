package userManagementPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOut extends PageBase {

	public SignOut(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "userAccountDrop")
	WebElement UserAccountDropdown;

	@FindBy(linkText = "My Profile")
	WebElement MyProfileLink;

	@FindBy(linkText = "SignOut")
	WebElement SignOutLink;
	
	
	public void UserCanSignOut()
	{
		clickButton(UserAccountDropdown);
		clickButton(SignOutLink);
	}
	
	

}
