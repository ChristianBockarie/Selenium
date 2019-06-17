
package com.Class08;

import org.openqa.selenium.By;	
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;



public class rightClickTask extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://www.saucedemo.com/");
		WebElement rightClick = driver.findElement(By.cssSelector("input#password"));
		Actions action = new Actions(driver);
		action.contextClick(rightClick).click().perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
