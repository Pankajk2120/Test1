package pom.testcases.ladbs;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.pages.DatetimepickerDemo;
import pom.pages.LaunchPage;
import pom.testcases.base.BaseTest;

public class Datetimepicker extends BaseTest {
	String testCaseName = "Datetimepicker";
	@Test
    public void DatetimepickerDemo() {
		ExtentTest test = reports.createTest(testCaseName);
       
        LaunchPage launchPage = new LaunchPage(driver, test);
        PageFactory.initElements(driver, launchPage);

        BasePage basePage = new BasePage(driver, test);
        PageFactory.initElements(driver, basePage);
        
        DatetimepickerDemo DatetimepickerDemo = new DatetimepickerDemo(driver, test);
        PageFactory.initElements(driver, DatetimepickerDemo);
 
        test.log(Status.INFO, "Selenium Using Java");
        DatetimepickerDemo.RedirectToDatePicker();
        //DatePicker1(String Month, String Year, String Day, String Hours, String Minute)
        DatetimepickerDemo.DatePicker1("January", "2025", "26", "01", "30");
        
	}
}
