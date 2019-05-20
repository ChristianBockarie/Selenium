package com.Class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingControls {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizing my google chrome browser
		driver.get("http://uitestpractice.com/");// navigating to website
		
		System.out.println("Title of the website: " + driver.getTitle());
		
		driver.findElement(By.linkText("Select")).click();// click in on the select link

		// Accessing the first drop down
		WebElement singleDropDown = driver.findElement(By.cssSelector("select#countriesSingle"));
		Select select = new Select(singleDropDown);

		List<WebElement> optionsAvailable = select.getOptions();
		System.out.println("Total amount of options in the dropdwon " + optionsAvailable.size());
		select.selectByIndex(1);

		// Accessing the second drop down
		WebElement MultipleDD = driver.findElement(By.cssSelector("select#countriesMultiple"));
		Select select1 = new Select(MultipleDD);

		List<WebElement> optionsAvailable2 = select.getOptions();
		System.out.println("Total amount of options in the second dropdwon " + optionsAvailable2.size());
		
		// Selecting all the drop downs
		select1.selectByIndex(0);
		select1.selectByIndex(1);
		select1.selectByIndex(2);
		select1.selectByIndex(3);
		Thread.sleep(2000);
		
		// de selecting the index of the second drop down
		select1.deselectByIndex(2);
		
		Thread.sleep(2000);
		//driver.quit();
	}

}
