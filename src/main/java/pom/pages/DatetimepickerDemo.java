package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class DatetimepickerDemo extends BasePage{

	public DatetimepickerDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToDatePicker() {
		try {
			test.log(Status.INFO, "Redirecting to the Date Picker Page");
			driver.navigate().to(ConstantsConfig.DatePicker);
			Thread.sleep(1000);
			driver.manage().window().maximize();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DatePicker1(String Month, String Year, String Day, String Hours, String Minute) {
		try {
			WebElement calendar1 = driver.findElement(ConstantsConfig.DatePicker1);
			calendar1.click();
			
	        waitForVisibility(driver.findElement(ConstantsConfig.DatePicker1Visible),driver);	
			Thread.sleep(2000);
	
			WebElement monthDropdown = driver.findElement(ConstantsConfig.Calendar1Month);
			//monthDropdown.click();
            Select monthSelect = new Select(monthDropdown);
            String currentMonth = monthSelect.getFirstSelectedOption().getText();
            System.out.println("currentMonth : "+currentMonth);
            monthSelect.selectByVisibleText(Month);
            
            WebElement yearInput = driver.findElement(ConstantsConfig.Calendar1Year);
            String currentYear = yearInput.getAttribute("value");
            System.out.println("currentYear : "+currentYear);
            yearInput.clear();
            yearInput.sendKeys(Year);

            WebElement dateToSelect = driver.findElement(By.xpath("//div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']//div[@class='dayContainer']/span[@class='flatpickr-day' or @class='flatpickr-day today']/[normalize-space()='"+Day+"']"));
            dateToSelect.click();
            
            WebElement hours1 = driver.findElement(ConstantsConfig.Hours);
            hours1.clear();
            hours1.sendKeys(Hours);
            System.out.println("Hours : "+Hours);
            
            WebElement Minute1 = driver.findElement(ConstantsConfig.Minute);
            Minute1.clear();
            Minute1.sendKeys(Minute);
            System.out.println("Minute : "+Minute);
            
           WebElement amPmToggle = driver.findElement(ConstantsConfig.toggle_AMPM);
            if (!amPmToggle.getText().equals("AM")) {
                amPmToggle.click();
            }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
