package com.Class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class windowsVerification extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * @all TC 1: ToolsQA Windows verification Open chrome browser Go to
		 * “https://the-internet.herokuapp.com/” Click on “Multiple Windows” link Click
		 * on “Elemental Selenium” Verify title of second window is “Elemental Selenium:
		 * Receive a Free, Weekly Tip on Using Selenium like a Pro” Close second window
		 * Click on “Click Here” link Verify title if newly open window is “New Window”
		 * Close second window Verify title of second window is “The Internet” Quit
		 * browser NOTE: Selenium execution could be too fast, please use Thread.sleep
		 */

		// opening chrome browser
		CommonMethods.setUpDriver("chrome", "http://www.google.com/");
		
		// getting to the herokuapp website
		driver.get("https://the-internet.herokuapp.com/");
		
		// clicking on the multiple windows link
		String internetTitle = driver.getWindowHandle();
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		// clicking on the elemental Selenium link
		driver.findElement(By.partialLinkText("Elemental")).click();

		// Switching between windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		internetTitle = it.next();

		// Verifying the Elemental window Title
		String elementalWindow = it.next();
		elementalWindow = driver.switchTo().window(elementalWindow).getTitle();
		if (elementalWindow.equals(elementalWindow)) {
			System.out.println("The Elemental window title is = " + elementalWindow);
		}
		Thread.sleep(2000);
		driver.close();// closing elemental window
		
		//Switching back to the home/parent browser in order to perform second action
		driver.switchTo().window(internetTitle);
		Thread.sleep(1000);
		
		// click on "CLICK HERE" link
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		windows = driver.getWindowHandles();
		it=windows.iterator();
		internetTitle = it.next();
		
		//Verifying the Click Here New window Title 
		String clickHere = it.next();
		clickHere = driver.switchTo().window(clickHere).getTitle();
		if(clickHere.equalsIgnoreCase(clickHere)) {
		System.out.println("The click here window title is :" + clickHere); 
		}
		driver.close();//closing the click here window browser
		
		//Verifying Internet Title window
		internetTitle = driver.switchTo().window(internetTitle).getTitle();
		System.out.println("The internet Title window is : " + internetTitle);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
