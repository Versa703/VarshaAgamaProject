
package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmModule {

	static void fillEmployeedetailsform(WebDriver driver){
		//put the value in employee name
		driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Robert Craig");
		// Put the value in user name
		driver.findElement(By.name("systemUser[userName]")).sendKeys("robert.craigss");
		//click on save button
		driver.findElement(By.name("btnSave")).click();
	}	
	public static void main(String[] args) {
     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varsha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//launching a chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		//driver.findElement(By.linkText("Forgot your password?")).click();
	//	driver.findElement(By.partialLinkText("Forgot")).click();

		//And condition
		//driver.findElement(By.xpath("//*[@id=\'txtUsername\' and @name= 'txtUsername']")).sendKeys("aaaa");
		
		//or condition
		//driver.findElement(By.xpath("//*[@id=\'txtPassword\' or @type='password']")).sendKeys("bbbbb");
		
		//relative path i.e xpath
		//driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).click();
		
		//Absolute path i.e full path
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input"));
		
		//Xpath=//*[contains(@type,'sub')] 
		//driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
				
				//label[starts-with(@id,'message')]
	  // driver.findElement(By.xpath("//*[starts-with(@value,'LOGIN')]")).click();
		//going on Admin
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		//put the value in user name
		driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("VVVaaa");
		//put the vlaue in user role by dropdown
		driver.findElement(By.id("searchSystemUser_userType")).click();
		driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userType\"]/option[2]")).click();
		//Put the value in Employee name
		driver.findElement(By.name("searchSystemUser[employeeName][empName]")).sendKeys("Jasmine");
		//Put the value in dropdown by using the dropdown
		driver.findElement(By.name("searchSystemUser[status]")).click();
		driver.findElement(By.xpath("//*[@id=\"searchSystemUser_status\"]/option[2]")).click();
		
		
		//Click the add button
		driver.findElement(By.name("btnAdd")).click();
		
		//Fill the employe details form
		fillEmployeedetailsform(driver);
	
		
		

		
	}

}
