package pom.testcases.ladbs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pom.base.BasePage;
import pom.pages.LaunchPage;
import pom.pages.DateDemo;
import pom.testcases.base.BaseTest;
import pom.util.ConstantsConfig;

public class DateSelection extends BaseTest {
	String testCaseName = "Checkbox";
	@Test
    public void testElectricalPermit() throws InterruptedException {
		ExtentTest test = reports.createTest(testCaseName);
       
        LaunchPage launchPage = new LaunchPage(driver, test);
        PageFactory.initElements(driver, launchPage);

        BasePage basePage = new BasePage(driver, test);
        PageFactory.initElements(driver, basePage);
    
        DateDemo dateDemo = new DateDemo(driver, test);
        PageFactory.initElements(driver, dateDemo);
       
        dateDemo.gotologinladbs1(ConstantsConfig.TSE_StaffUser, ConstantsConfig.TSE_StaffPass);
       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        basePage.waitForVisibility(driver.findElement(ConstantsConfig.LADBS_Service), driver);
		driver.findElement(ConstantsConfig.LADBS_Service).click();
		Thread.sleep(1000);
		basePage.waitForVisibility(driver.findElement(ConstantsConfig.PermitLA), driver);
		driver.findElement(ConstantsConfig.PermitLA).click();
		
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		
		basePage.waitForVisibility(driver.findElement(ConstantsConfig.ClosePopup), driver);
		driver.findElement(ConstantsConfig.ClosePopup).click();
		
		basePage.waitForVisibility(driver.findElement(ConstantsConfig.Angeleno_login), driver);
		driver.findElement(ConstantsConfig.Angeleno_login).click();
        //dateDemo.gotologinladbs2();
        //dateDemo.RedirectToReviewTSEClearance();
        dateDemo.ReviewSubmittedDate();

	}
	
}
