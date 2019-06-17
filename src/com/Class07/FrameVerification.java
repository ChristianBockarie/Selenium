package com.Class07;

import org.openqa.selenium.By;

import utils.CommonMethods;


public class FrameVerification extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		
		driver.switchTo().frame("//iframe[@name='iframe1']");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Guest Blogs')]")).click();
		

	}

}
