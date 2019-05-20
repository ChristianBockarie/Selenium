package com.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		
		//to create an extension file for ChromeDriver, we use chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:Amazon.com");
		driver.get("http://gmail.com");
	}

}
