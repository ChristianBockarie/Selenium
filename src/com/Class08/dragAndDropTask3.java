package com.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class dragAndDropTask3 extends CommonMethods{
	/*
	 * Task Three
Ahead to http://uitestpractice.com/Students/Index
Click on the Actions
Click and hold on 1,2,3,4 boxes
Close the browser
	 */
	public static void main(String[] args) throws InterruptedException {
		 setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		 driver.findElement(By.xpath("//a[text()='Actions']")).click();
		 WebElement hold = driver.findElement(By.xpath("//li[@name='one']"));
		 Actions action = new Actions(driver);
		 action.clickAndHold(hold).perform();
		 
		 Thread.sleep(2000);
		 driver.close();
	}

}
