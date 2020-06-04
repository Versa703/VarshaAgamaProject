
package com.login;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varsha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
   
		//Launching a new chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the size of the browser
		 driver.manage().window().maximize();
		 
		 //launching the google
		 driver.get("https://www.google.com/?gws_rd=ssl");
		 //type the testing word
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Testing");
		 
		 //click on google search
		 driver.findElement(By.xpath("//*[@id=\"gsr\"]")).click();
		 
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		 //code for how to counts the total links
		 int numberOfLinks = driver.findElements(By.tagName("a")).size();
		 
		 //Print the value of total links on web page
		 System.out.println("Number of links on Web Page :" +numberOfLinks );
		 
	}

}
