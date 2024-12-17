package pom.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class BasePage {
	public WebDriver driver;
	public ExtentTest test;

	public BasePage(WebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
	}
	
	public static void waitForVisibility(WebElement element, WebDriver driver){
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void waitForVisibilityOfElements(By elementsId, WebDriver driver){
		WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementsId));
		
	}
	public static void waitForVisibilityShort(WebElement element, WebDriver driver){
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitForInvisibility(By element, WebDriver driver){
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 35);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void clickonElement(By buttonID){
		try{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		 js.executeScript("arguments[0].click();", driver.findElement(buttonID));
		}
			catch(Exception ex){
		ex.printStackTrace();
				}
	}
	
	public void scrollToElement(By scrollElement){
		try{
			WebElement element = driver.findElement(scrollElement);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void scrollToElement1(WebElement element) {
	    try {
	    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        Thread.sleep(500);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public void SelectDate(By calendarId, By Year, By Month, int year, String month, String daycellclass, int day) {
	    try {
	    	WebElement calendarWidget = driver.findElement(calendarId);
            calendarWidget.click();
            
            WebElement yearSpinner = driver.findElement(Year);
            yearSpinner.clear();
            yearSpinner.sendKeys(String.valueOf(year));
            
            WebElement monthDropdown = driver.findElement(Month);
            Select monthSelect = new Select(monthDropdown);
            monthSelect.selectByVisibleText(month);
            
            WebElement dayCell = driver.findElement(By.xpath("//td[@class='"+daycellclass+"'][normalize-space()='"+day+"']"));
            dayCell.click();
	    	
            System.out.println("Date selected: " + year + "-" + month + "-" + day);
	    	
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.err.println("Error while selecting the date: " + e.getMessage());
	    }
	}

	
}
