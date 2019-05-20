package com.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@name,'ail')]")).sendKeys("5712888151");
		driver.findElement(By.xpath("//input[contains(@id,'pa')]")).sendKeys("78236332");
		driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();
	}

}
