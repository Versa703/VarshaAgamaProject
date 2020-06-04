
package com.login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varsha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.facebook.com/");
       
       TakesScreenshot ts = (TakesScreenshot)driver;
       File source = ts.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(source, new File("./forScreenShot/facebook.png"));
       System.out.println("the Screenshot is taken");
       driver.quit();
	}

}
