
package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LogInModule {

	public static void main(String[] args) {
	
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varsha\\Downloads\\selenium downloads\\chromedriver.exe");

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varsha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//launching a chrome browser
		//WebDriver driver = new ChromeDriver();
		
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Varsha\\Downloads\\selenium downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//launching a firefox browser
		//WebDriver driver = new FirefoxDriver();
		
  System.setProperty("webdriver.ie.driver", "C:\\Users\\Varsha\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
    //launching a internet explorer browser
  WebDriver driver = new InternetExplorerDriver();
		 
       //get the title of the page
		driver.get("https://www.facebook.com/");
		//closing the title of the page
		driver.close();
  
	}

}
