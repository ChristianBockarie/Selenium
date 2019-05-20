package com.Class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximizing my google chrome browser
		driver.get("http://amazon.com/");//navigating to amazon website
		System.out.println("Title of the website: " + driver.getTitle());
		
		WebElement department = driver.findElement(By.cssSelector("select#searchDropdownBox"));//finding the elements in the dropdown
		Select select = new Select(department);//selecting department
		List <WebElement> allDept = select.getOptions();//getting the list of all options in the dropdown
		System.out.println("List of all Department " +allDept.size());//printing the size
		
		//printing all the list using iterator and get text
		Iterator<WebElement> it = allDept.iterator();
		while (it.hasNext()) {
			String dept = it.next().getText();
			System.out.println(dept);
		}
		//Selecting computers in the department
		select.selectByVisibleText("Computers");
		Thread.sleep(2000);
		
		//quitting the browser
		driver.quit();
	}
}
