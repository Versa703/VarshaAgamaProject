package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeLogIn {

	public static void main(String[] args) {
		
     WebDriverManager.chromedriver().setup();
    // ChromeOptions options = new ChromeOptions();
     
    // options.setHeadless(true);
     
    // WebDriver driver= new ChromeDriver(options);
     
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.google.com/");
	}

}
