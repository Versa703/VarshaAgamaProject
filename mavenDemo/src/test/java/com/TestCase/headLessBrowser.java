package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class headLessBrowser {

	public static void main(String[] args) {
		
		//HtmlUnitDriver driver = new HtmlUnitDriver();
		//driver.get("https://www.google.com");
   //System.out.println("Title of the page is  "+ driver.getTitle());
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		//WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.google.com");
		
		
		System.out.println(driver.getTitle());

	
	}



	

}
