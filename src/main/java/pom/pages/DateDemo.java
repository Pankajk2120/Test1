package pom.pages;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class DateDemo extends BasePage {
	public DateDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void gotologinladbs1(String Uname, String Pass) {
		try {
			driver.get(ConstantsConfig.LADBS_URL);
			test.log(Status.INFO, "Opening URL");
			driver.manage().window().maximize();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			WebElement usernameField = driver.findElement(ConstantsConfig.LADBS_Username);
			usernameField.sendKeys(Uname);
			
			driver.findElement(ConstantsConfig.LADBS_Next).click();
			Thread.sleep(1000);
			
			WebElement PasswordField = driver.findElement(ConstantsConfig.LADBS_Password);
			PasswordField.sendKeys(Pass);
	
			waitForVisibility(driver.findElement(ConstantsConfig.LADBS_SignIn), driver);
			driver.findElement(ConstantsConfig.LADBS_SignIn).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gotologinladbs2() {
		try {
			Thread.sleep(1000);
			waitForVisibility(driver.findElement(ConstantsConfig.LADBS_Service), driver);
			driver.findElement(ConstantsConfig.LADBS_Service).click();
			Thread.sleep(1000);
			waitForVisibility(driver.findElement(ConstantsConfig.PermitLA), driver);
			driver.findElement(ConstantsConfig.PermitLA).click();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(1));
			
			waitForVisibility(driver.findElement(ConstantsConfig.ClosePopup), driver);
			driver.findElement(ConstantsConfig.ClosePopup).click();
			
			waitForVisibility(driver.findElement(ConstantsConfig.Angeleno_login), driver);
			driver.findElement(ConstantsConfig.Angeleno_login).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RedirectToReviewTSEClearance() {
		try {
			test.log(Status.INFO, "Redirecting to the Review TSE Clearance");
			waitForVisibility(driver.findElement(ConstantsConfig.ClickonReviewTSE), driver);
			driver.findElement(ConstantsConfig.ClickonReviewTSE).click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ReviewSubmittedDate() {
		//SelectDate(By calendarId, By Year, By Month, By Day, int year, String month, int day, String daycellclass)
		SelectDate(ConstantsConfig.ReviewTSE_FromDate, ConstantsConfig.ReviewTSE_FromYear, ConstantsConfig.ReviewTSE_FromMonth, 2024, "November", ConstantsConfig.daycellclass, 1);
	}


}
