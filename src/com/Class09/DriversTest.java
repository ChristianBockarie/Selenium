package com.Class09;

import utils.CommonMethods;

public class DriversTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("internetexplorer", url);
		Thread.sleep(5000);
		driver.get("http://google.com");

	}

}
