package com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//Relative XPath
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		}
}
