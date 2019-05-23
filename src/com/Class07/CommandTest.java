package com.Class07;

import utils.CommonMethods;

public class CommandTest extends CommonMethods {

	public static void main(String[] args) {
		CommonMethods.setUpDriver("chrome", "http://amazon.com");
		driver.close();
	}

}
