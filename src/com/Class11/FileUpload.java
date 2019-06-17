package com.Class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class FileUpload extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		//Steps in uploading a file
		String url="http://the-internet.herokuapp.com";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("File Upload")).click();
		Thread.sleep(3000);
		
		String filePath="C:\\Users\\avanc\\eclipse-workspace\\SeleniumBasics\\ScreenShots\\Google\\GoolePage.png";
		driver.findElement(By.xpath("//*[@id=\'file-upload']")).sendKeys(filePath);
		driver.findElement(By.id("file-submit")).click();
		
		boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("File uploaded successfully");
		}else {
			System.out.println("File uploaded successfully");
		}
		
		
		
		  //Steps to take screenshot 
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screeshot = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File(pathname));
		try {
			FileUtils.copyFile (screeshot, new File("ScreeShots/Google/TestShot.png"));
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println("Error taking screenshsot");
		}
		  Thread.sleep(2000); 
		  driver.quit();
		 
	}
}