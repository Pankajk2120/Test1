package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class FormDataDemo  extends BasePage{

	public FormDataDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToFormData() {
		try {
			test.log(Status.INFO, "Redirecting to the Form Data Page");
			driver.navigate().to(ConstantsConfig.FormData);
			Thread.sleep(1000);
			driver.manage().window().maximize();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Form1(String FName, String email ,String Gender) {
		try {
			WebElement FirstName = driver.findElement(ConstantsConfig.F_name);
			FirstName.sendKeys(FName);
			
			WebElement Email = driver.findElement(ConstantsConfig.F_email);
			FirstName.sendKeys(email);
			
			WebElement Gender1 = driver.findElement(By.xpath("//input[@type='radio' and following-sibling::label[text()='"+Gender+"']]"));
			Gender1.click();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DateofBirth(String Date) {
		try {
			test.log(Status.INFO, "Redirecting to the Form Data Page");
			WebElement DOB = driver.findElement(By.xpath("//input[@id='dob']"));
			DOB.clear();
			DOB.sendKeys(Date);
			Thread.sleep(1000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
