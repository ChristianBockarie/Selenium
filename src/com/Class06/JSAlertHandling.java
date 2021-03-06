package com.Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\avanc\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://uitestpractice.com/");
        //click on switch link and alert button
        driver.findElement(By.linkText("Switch to")).click();
        driver.findElement(By.id("alert")).click();
        Thread.sleep(2000);
        
        //switch focus to alert button
        Alert  alert = driver.switchTo().alert();
        alert.accept();
        
        //clicking on confirm button
        driver.findElement(By.id("confirm")).click();
        Alert confirm = driver.switchTo().alert();
        //getting text of an alert
        String alertText = confirm.getText();
        System.out.println("Text of confirm alert " + alertText);
        Thread.sleep(2000);
        confirm.dismiss();
        
        //clicking on prompt alert
        driver.findElement(By.id("prompt")).click();
        Alert prompt = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("Text of prompt alert " + prompt.getText());
        prompt.accept();
        
        Thread.sleep(2000);
        driver.quit();
	}

}
