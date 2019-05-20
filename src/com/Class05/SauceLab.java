package com.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLab {

	public static String userName = "standard_user";
	public static String password = "secret_sauce";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement userNameTxt = driver.findElement(By.xpath("//input[@data-test='username']"));
		userNameTxt.sendKeys(userName);
		Thread.sleep(1000);
		
		WebElement passwordTxt = driver.findElement(By.cssSelector("input[id='password']"));
		passwordTxt.sendKeys(password);
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[class='btn_action']")).click();
		
		boolean robotIcon = driver.findElement(By.xpath("//div[@class='peek']")).isDisplayed();

		if (robotIcon) {
			System.out.println("Robot icon is Displayed");
		} else {
			System.out.println("Robot icon NOT displayed");
		}

		WebElement productTxt = driver.findElement(By.xpath("//div[text()='Products']"));
		String txtDisplayed = productTxt.getText();

		if (txtDisplayed.contains(txtDisplayed)) {
			System.out.println(txtDisplayed + " is available next to robot Icon, Test PASSED ");
		} else {
			System.out.println(txtDisplayed + " is NOT available next to robot Icon, Test FAILED ");
		}

	}

}
