package com.Class07;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Iframe extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		//Using name to find Iframe
		driver.switchTo().frame("iframe_a");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Christian");
		
	}
	
}