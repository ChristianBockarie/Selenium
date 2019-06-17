package com.Class10;

import java.util.Iterator;	
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;


public class StaticWebTableTask extends CommonMethods  {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Table headers and rows verification
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Sortable Data Tables” link
Verify tables consist of 4 rows and 6 columns
Print name of all column headers
Print data of all rows
		 */
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		//Clicking on the Sortable Data Tables link
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		//Verifying that table consist of 4 rows and printing the size of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("Table consist of "+rows.size()+ " rows");
		//printing data of all rows
		for(WebElement row:rows) {
			String rowText=row.getText();
			System.out.println(rowText);
		}
		System.out.println();//printing a blank space
		
		//Verifying that table consist of 6 columns and printing the size of column
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println("Table consist of "+cols.size()+ " cols");
		//printing name of all column headers
		Iterator<WebElement> it=cols.iterator();
		while(it.hasNext()) {
			String colText=it.next().getText();
			System.out.println(colText);
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
