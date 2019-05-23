package com.Class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Handles extends CommonMethods {

	public static void main(String[] args) {
		
		CommonMethods.setUpDriver("chrome", "https://www.amazon.com/");
		String Parent=driver.getTitle();
		String ParentId=driver.getWindowHandle();
		System.out.println("The title of the parent : " + Parent + " and the Id is " + ParentId);
		driver.findElement(By.xpath("//a[@id='nav-your-amazon']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it=allWindows.iterator();
		Parent= it.next();
		
		
		
		String Child = it.next();
		driver.switchTo().window(Child);
		Child=driver.getTitle();
		String ChildId=driver.getWindowHandle();
		System.out.println("The title or the xhild : " + Child + " and the Id is " + ChildId);
		driver.switchTo().window(Parent);
		
		
		
		
		

	}

}
