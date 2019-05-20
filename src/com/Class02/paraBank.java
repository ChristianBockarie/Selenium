package com.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=5BB06572D8511D6811AE3B79811217E5");
		driver.findElement(By.id("customer.firstName")).sendKeys("Bob");
		Thread.sleep(2000);
		driver.findElement(By.name("customer.lastName")).sendKeys("Evans");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.street")).sendKeys("123 street");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.city")).sendKeys("Chantilly");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.state")).sendKeys("VA");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("000-000-0000");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.ssn")).sendKeys("000-000-0000");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.username")).sendKeys("Testcase");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.password")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.className("button")).click();
		driver.wait();
	}

}
