package pom.testcases.base;
import reports.ExtentManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.util.ConstantsConfig;


public class BaseTest {
	 public WebDriver driver;
	 //protected ExtentReports extent;
	 public ExtentTest test;
	 protected ExtentReports reports;
		
		
	@BeforeMethod
	public void Init() {
		reports =ExtentManager.getReports();
		
				WebDriverManager.chromedriver().setup();
		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("--remote-allow-origins=*");
		        driver = new ChromeDriver(options);
		}
	
	//@AfterMethod
	public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            reports.flush();
	        }
	    }
	
	public static void waitForVisibility1(WebElement element, WebDriver driver){
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	 public WebDriver getDriver() {
	        return driver;
	    }
	
	 

}
