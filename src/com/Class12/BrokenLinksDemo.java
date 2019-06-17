package com.Class12;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class BrokenLinksDemo extends CommonMethods {
	String browser = "chrome";
	String url = "http://facebook.com/";

	@BeforeMethod
	public void setUp() {
		setUpDriver(browser, url);
	}

	@Test
	public void linkVerification() throws MalformedURLException {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("This website " +driver.getTitle()+ " has "  + links.size() + " Links");
		for (WebElement link : links) {
			String linkUrl = link.getAttribute("href");

			try {
				URL url = new URL(linkUrl);
				HttpURLConnection conn;
				conn = (HttpURLConnection) url.openConnection();
				int code = conn.getResponseCode();
				if (code == 200) {
					System.out.println("Link is valid " + link.getText());

				} else {
					System.out.println("Link is NOT valid " + link.getText());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
