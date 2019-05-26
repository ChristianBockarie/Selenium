package com.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class doubleClickTask extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("christian");
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.xpath("//input[@type='password']"))).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
