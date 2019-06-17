package Sprinters;

import java.util.List;	

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;


public class Task1 extends CommonMethods {

	/**
	 * TC 1: Users Application Form Fill
	 * 1.Open chrome browser
	 * 2.Go to “http://uitestpractice.com/”
	 * 3.Click on “Forms” link
	 * 4.Fill out the entire form
	 * 5.Close the browser
	 * MUST USE Functions: 
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		//Assigning the website url to a string
		String url = "http://uitestpractice.com/";
		
		//using the setup Driver function to set up system property and navigating to the website
		setUpDriver("chrome", url);
		//Clicking on the "forms" link
		driver.findElement(By.linkText("Form")).click();
		//filling the forms
		WebElement firstname = driver.findElement(By.id("firstname"));
		sendText(firstname, "Christian");
		WebElement lastName = driver.findElement(By.id("lastname"));
		sendText(lastName, "Bockarie");
		
		driver.findElement(By.name("optradio")).click();;
		
		driver.close();

	
	
	
	
	
	}

}
