package com.Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestCase {

	public static void main(String[] args) {
		
		/*
		 * Amazon Page Title Verification: 
		 * Open chrome browser
		 * Go to "https://www.amazon.com/"
		 * Verify Title "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more" is displayed 
		 */
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.Amazon.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("This is the right title");
		}else {
			System.out.println("Sorry, This isn't the right title");
		}
	}

}
