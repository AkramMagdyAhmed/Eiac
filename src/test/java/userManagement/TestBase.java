package userManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;

public class TestBase {
	

	
	public static WebDriver driver;
	@BeforeSuite
	@Parameters ({"browser"})
	public void startDriver (@Optional("chrome") String browserName)
	{
		if (browserName.equalsIgnoreCase("firefox")) {
			String PathFireFox= System.getProperty("user.dir")+"\\drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", PathFireFox);
			driver = new FirefoxDriver();
		}
		
		else if (browserName.equalsIgnoreCase("chrome")) {
			String Pathchrome = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", Pathchrome);
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://eiac.mosandah.com.sa/login");
		
	}
	
	@AfterSuite
	public void stopDriver()
	{
		driver.close();
	}
	
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Failed!");
			System.out.println("Taking Screenshot....");
			Helper.captureScreenshot(driver, result.getName());
		}
	}

}
