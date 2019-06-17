package com.Synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonMethods;

public class Example {
	/**
	 * Test case 
	 *1 . open browser
	 * 2. navigate to "https://www.amazon.com/"
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		//opening browser
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//navigating to amazon website
		driver.navigate().to("http://www.amazon.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		driver.close();
		
		
		
		
		
	}

}
