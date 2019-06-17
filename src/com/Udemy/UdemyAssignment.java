package com.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UdemyAssignment {

	public static void main(String[] args) throws InterruptedException {
		//Setting system property and creating the object of the class
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//maximizing window
		driver.manage().window().maximize();
		driver.get("http://www.cleartrip.com/");
		//Selecting adult dropdown
		Select adults = new Select(driver.findElement(By.id("Adults")));
		adults.selectByValue("3");
		//selecting child dropdown
		Select child = new Select(driver.findElement(By.id("Childrens")));
		child.selectByVisibleText("4");
		//Clicking on current date
		driver.findElement(By.cssSelector("div.span.span15.datePicker")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		driver.findElement(By.id("MoreOptionsLink")).click();
		//Selecting desired airline
		WebElement airLine = driver.findElement(By.id("AirlineAutocomplete"));
		airLine.sendKeys("FRA");
		Thread.sleep(2000);
		airLine.sendKeys(Keys.ARROW_DOWN);
		airLine.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//Clicking search button
		driver.findElement(By.id("SearchBtn")).click();
		//Grabbing error message and printing it in console
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		//Closing Browser
		Thread.sleep(2000);
		driver.close();
	}

}
