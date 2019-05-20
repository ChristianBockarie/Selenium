package com.Class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	/*
	 * Check all Years of experience radio buttons are clickable
	 * ---------------------------------------------------------
	 * Check all Automation Tools checkboxes are clickable 
	 * and keep "Selenium Webdriver" options as selected 
	 */

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",  "\\Users\\avanc\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	//WebElement syOeRadioBttn=driver.findElement(By.xpath("//input[@name='exp']"));
	//System.out.println(syOeRadioBttn.isEnabled());
	
	List <WebElement> yOeRadioBttn = driver.findElements(By.xpath("//input[@name='exp']"));
	System.out.println(yOeRadioBttn.size());
	for (WebElement yOe : yOeRadioBttn) {
		if (yOe.isEnabled()) {
			String yearsOfExp = yOe.getAttribute("value");
			System.out.println(yearsOfExp);
		yOe.click();
			Thread.sleep(2000);
			if (yearsOfExp.equals("exp-1")) {
				Thread.sleep(2000);
				yOe.click();
			}
		}
	
	}

	}
}
