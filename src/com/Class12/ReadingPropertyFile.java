package com.Class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import utils.CommonMethods;

public class ReadingPropertyFile {
	Properties prop; //make property variable as global variable that way you will be able to access it everywhere

	@Test
	public void readFile() {

		String filePath = "src/configs/credentials.properties";

		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("url"));

		// if you don't want to extend your common method, you can call it by the class name
		
		CommonMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
		CommonMethods.driver.close();

	}

}
