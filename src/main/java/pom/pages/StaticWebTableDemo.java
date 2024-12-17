package pom.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class StaticWebTableDemo extends BasePage{

	public StaticWebTableDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToWebTable() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.StaticWebTableURL);
			driver.manage().window().maximize();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void StaticWebTableElements() {
		try {
			test.log(Status.INFO, "Opening WebElement");
			// Locate the table element
			WebElement table = driver.findElement(ConstantsConfig.StaticWebTable);
			
			
			
			// Fetch all rows of the table
			List<WebElement> rows = driver.findElements(ConstantsConfig.StaticWebTableRows);
			System.out.println("Total Number of Rows in WebTable : "+rows.size());
			
			// Iterate through rows
			for(int i=0; i<rows.size();i++) {
				List<WebElement> Columns = rows.get(i).findElements(ConstantsConfig.StaticWebTableColumns);
				//System.out.println("Row " + (i + 1) + " has " + Columns.size() + " columns.");
				
				// Print each column's content
				for (WebElement cell : Columns) {
	                System.out.print(cell.getText() + "\t");
	            }
				System.out.println();
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
