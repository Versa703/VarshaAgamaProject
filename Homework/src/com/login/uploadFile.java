

package com.login;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varsha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		//Launching a new chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the size of the browser
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 
		 //launching the file upload
		  //driver.get("https://filebin.net/");
		 //create a notepad file and save on desktop and copy the path of that file and file name
		 // driver.findElement(By.id("fileField")).sendKeys("C:\\Users\\Varsha\\Desktop\\Notepad.txt");
		 
		 //launching the new title basic authentication
		 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		 
		 //driver.findElement(By.name("q")).sendKeys("seleniumhq download");

     
		//in google search writing the selenium hq keyword
		// driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Seleniumhq");
		
		 //click on google search
		// driver.findElement(By.xpath("//*[@id=\"gsr\"]")).click();
		 
		 //After search go to download and click
	//	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/table/tbody/tr[1]/td[1]/div/span/h3/a")).click();
		
		//download IE 64 bit and click
	//driver.findElement(By.xpath("/html/body/div[2]/div[2]/p/a[2]")).click();
	
	//now IE download,and i have to show the path of downloaded file so create a new object and pass the path of the IE with file name
	//File file = new File("C:\\Users\\Varsha\\Downloads\\IEDriverServer_x64_3.150.1 (4).zip");
	
	//By using the boolean,we are checking the this file is correctly downloaded or not
	//boolean check = file.exists();
	
	//Print the value of the IE, This is downloaded or not
	//System.out.println(check);
		


		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 ////*[@id="tsf"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]
		 
	}

}
