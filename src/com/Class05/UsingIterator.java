package com.Class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIterator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links " +links.size());
		
		Iterator<WebElement> it=links.iterator();
		int count=0;
		
		while(it.hasNext()) {
			String itText=it.next().getText();
			if(!itText.isEmpty()) {
				System.out.println(itText);
				count++;
			}
		}
		System.out.println("Total number of links with text "+count);
		driver.quit();
	
	}

	}
