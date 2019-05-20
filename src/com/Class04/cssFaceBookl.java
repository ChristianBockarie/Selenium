package com.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssFaceBookl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 	driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id^=em]")).sendKeys("5712888151");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name$='ss']")).sendKeys("78236332");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type*='mi']")).click();
	}
}
