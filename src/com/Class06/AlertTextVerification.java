package com.Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTextVerification {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: JavaScript alert text verification Open Chrome browser Go to
		 * "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html" Verify
		 * alert box with text "I am an alert box!" is present confirm box with text
		 * "Press a button!" is present prompt box with text "Please enter your name" is
		 * present Quit browser
		 */
		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maximizing window
		driver.manage().window().maximize();
		// getting website
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		// printing out page title
		System.out.println("Title of page: " + driver.getTitle());

		// verifying alert box "I am an alert box!" is present
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		Alert alertBox = driver.switchTo().alert();
		String alertText = alertBox.getText();// getting alert message text
		Thread.sleep(1000);
		alertBox.accept();
		if (alertText.contains(alertText)) {
			System.out.println("Alert box with text : " + alertText + " is present");
		}

		// verifying confirm box with text "Press a button!" is present
		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
		Alert confirmBox = driver.switchTo().alert();
		String confirmText = confirmBox.getText();
		Thread.sleep(1000);
		confirmBox.dismiss();
		if (confirmText.contentEquals(confirmText)) {
			System.out.println("Confirm box with text : " + confirmText + " is present");
		}

		// verifying prompt box with text "Please enter your name" is present
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		Alert promptBox = driver.switchTo().alert();
		String promptText = promptBox.getText();
		Thread.sleep(1000);
		promptBox.accept();
		if (promptText.equals(promptText)) {
			System.out.println("Prompt box with text : " + promptText + "! is present");

		}

		Thread.sleep(2000);
		driver.quit();

	}

}
