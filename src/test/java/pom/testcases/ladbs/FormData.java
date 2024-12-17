package pom.testcases.ladbs;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.pages.DatetimepickerDemo;
import pom.pages.FormDataDemo;
import pom.pages.LaunchPage;
import pom.testcases.base.BaseTest;

public class FormData  extends BaseTest {
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
 
        FormDataDemo FormDataDemo = new FormDataDemo(driver, test);
        PageFactory.initElements(driver, FormDataDemo);
        
        test.log(Status.INFO, "Selenium Using Java");
        FormDataDemo.RedirectToFormData();
        FormDataDemo.DateofBirth("12/12/2025");
        

	}
}
