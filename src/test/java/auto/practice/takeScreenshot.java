package auto.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takeScreenshot {
	
	public static void takeScreenshot(WebDriver driver, String screenshotName) {
		try {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        File destFile = new File("screenshot.png");
        FileUtils.copyFile(srcFile, destFile);
        System.out.println("Screenshot saved successfully!");
	   } catch (IOException e) {
	    	System.out.println("Failed to save screenshot: " + e.getMessage());
	    }
	}
	
	public void test() {
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
