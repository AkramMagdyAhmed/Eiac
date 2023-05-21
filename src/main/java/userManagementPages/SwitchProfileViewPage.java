package userManagementPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwitchProfileViewPage extends PageBase {

	public SwitchProfileViewPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "userAccountDrop")
	WebElement UserAccountDropdown;

	@FindBy(linkText = "My Profile")
	WebElement MyProfileLink;

	@FindBy(css = "button[class='mat-focus-indicator full-view-btn mat-raised-button mat-button-base']")
	WebElement SwitchToFullPageViewProfile;

	// @FindBy(css = "button[class='mat-focus-indicator full-view-btn mat-raised-button mat-button-base']")
	@FindBy(xpath = "//*[@id=\"content\"]/app-my-profile/div/div/div/div/div/div[2]/div/div/button")
	WebElement SwitchToTabViewProfile;

	public void UserCanSwitchToFullPageViewProfile() throws InterruptedException {
		clickButton(UserAccountDropdown);
		clickButton(MyProfileLink);
		clickButton(SwitchToFullPageViewProfile);
		Thread.sleep(2000);
	}

	public void UserCanSwitchToTabViewProfile() throws InterruptedException {
		clickButton(SwitchToTabViewProfile);
		Thread.sleep(2000);
	}

}
