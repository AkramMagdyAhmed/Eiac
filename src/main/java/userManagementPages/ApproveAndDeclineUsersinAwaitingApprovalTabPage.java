package userManagementPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApproveAndDeclineUsersinAwaitingApprovalTabPage extends PageBase{

	public ApproveAndDeclineUsersinAwaitingApprovalTabPage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(css = "mat-icon[class='mat-icon notranslate ml-auto material-icons mat-icon-no-color ng-star-inserted']")
	WebElement UserManagementLink;
	
	
	@FindBy(xpath = "//*[@id=\"content\"]/app-egac-staff/div/div[1]/div[1]")
	WebElement AwaitingApprovaltTab;
	
	
	

}
