package pom.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class ParallelTestingDemo extends BasePage {

	public ParallelTestingDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	
	public void RedirectToGoogleURL() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.GoogleURL);
			driver.manage().window().maximize();	
			String title  = driver.getTitle();
			System.out.println("Title of the Given Page : "+title);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void RedirectToBingURL() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.BingURL);
			driver.manage().window().maximize();	
			String title  = driver.getTitle();
			System.out.println("Title of the Given Page : "+title);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
