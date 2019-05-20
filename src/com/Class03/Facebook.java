package com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("http://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("inputtext")).sendKeys("5712888151");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("78236332");
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_2")).click();
		
		System.out.println("User Successfully logged in");
		
	}

}
