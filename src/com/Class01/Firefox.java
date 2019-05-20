package com.Class01;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		//to create an extension file for FirefoxDriver, we use geckodriver.exe
		System.setProperty("webdriver.gecko.driver", "\\Users\\avanc\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://amazon.com");
		
	}

}
