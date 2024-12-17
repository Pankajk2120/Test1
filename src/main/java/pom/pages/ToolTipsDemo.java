package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class ToolTipsDemo extends BasePage {

	public ToolTipsDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToToolTips() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.ToolTipsURL);
			driver.manage().window().maximize();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void test() {
		try {
			
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(ConstantsConfig.TooltiponRight)).perform();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
