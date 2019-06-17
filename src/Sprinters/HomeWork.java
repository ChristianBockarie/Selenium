package Sprinters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class HomeWork extends CommonMethods {
	/**
	 * TC 1: Table headers and rows verification 
	 * 1.Open browser and go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
	 * 2.Login to the application 
	 * 3.Create an Order 
	 * 4.Verify order of that person is displayed in the table "List of All Orders" 
	 * 5.Click on edit of that specific order 
	 * 6.Verify each order details 
	 * 7.Update street address
	 * 8.Verify in the table that street has been updated 
	 * 9.Close browser
	 */
	public static void main(String[] s) throws InterruptedException {

		// Assigning websites Url to a String
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

		// Using functions to set system property and getting the website
		setUpDriver("chrome", url);
		String title = driver.getTitle();
		System.out.println("Title of the webpage is : " + title);
		// Login in to the application
		WebElement UserName = driver.findElement(By.id("ctl00_MainContent_username"));
		sendText(UserName, "Tester");
		WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
		sendText(password, "test");
		driver.findElement(By.cssSelector("input.button")).click();

		// Creating an Order

		// Entering Product information
		driver.findElement(By.linkText("Order")).click();
		 
		selectValueFromDD(driver.findElement(By.cssSelector("select#ctl00_MainContent_fmwOrder_ddlProduct")), 1);
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtQuantity")), "1");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtUnitPrice")), "80");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtDiscount")), "15");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtName")), "John Doe");
		sendText(driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")), "123 Street Ave");
		sendText(driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")), "Ashton");
		sendText(driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")), "VA");
		sendText(driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")), "12345");

		// Payment Information
		String cardOfChoice = "American Express";
		List<WebElement> cardList = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement card : cardList) {
			if (card.isEnabled()) {
				String value = card.getAttribute("value");
				if (value.equals(cardOfChoice)) {
					card.click();
				}
			}
		}
		sendText(driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")), "012345678910");
		sendText(driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")), "01/23");
		driver.findElement(By.linkText("Process")).click();

		// Verifying order was successfully added
		
		//verifying new order message
		WebElement newOrderMessage = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder']/tbody/tr/td/div/strong"));
		String newOrder = newOrderMessage.getText();
		if (newOrderMessage.isDisplayed()) {
		System.out.println(newOrder);
		}
		
		//Clicking to view all orders
		driver.findElement(By.linkText("View all orders")).click();
		
		//verifying the cell information of the new order is diplayed in table "List of all orders" 
		WebElement order = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]"));
		String cellText = order.getText();
		System.out.println(cellText);
		String customerName = "John Doe";
		System.out.println("New order has been added to list of order and customer name is: " + customerName);
		
		//Click on edit of that Specific order
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[13]/input")).click();
		
		//verify each order detail
		WebElement product = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_ddlProduct']/option[2]"));
		String expectedProValue = "FamilyAlbum";
		String actualProValue = product.getAttribute("value");
		if(actualProValue.equals(expectedProValue)) {
		System.out.println("Actual value matches expected value :" + actualProValue);
		}
		else {
			System.out.println("Value doesnt match");
		}
		WebElement quantity = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
		String actualQuaValue = quantity.getAttribute("value");
		if(actualQuaValue.equals("1")) {
		System.out.println("Actual value matches expected value :" + actualQuaValue);
		}
		else {
			System.out.println("Value doesn't match");
		}
		WebElement price = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_txtUnitPrice']"));
		String actualPriValue = price.getAttribute("value");
		if(actualPriValue.equals("80")) {
			System.out.println("Actual value matches expected value :" + actualPriValue);
		}
		else {
			System.out.println("Value doesn't match");
		}
		WebElement discount =driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtDiscount"));
		String actualDisValue = discount.getAttribute("value");
		if(actualDisValue.equals("15")) {
			System.out.println("Actual value matches expected value :" + actualDisValue);
		}
		else {
			System.out.println("Value doesn't match");
		}
	
		
		// closing the browser
		driver.close();
	}
}
