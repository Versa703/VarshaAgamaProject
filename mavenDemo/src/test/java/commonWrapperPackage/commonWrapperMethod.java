package commonWrapperPackage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class commonWrapperMethod {

	WebDriver driver;
	
	
	public void insertApp(String Url) {
		//String strchromedriver = "C:\\Users\\Varsha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varsha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(Url);
	}

public void byid_sendkey(String id,String val) {
	driver.findElement(By.id(id)).sendKeys(val);
	}

public void byname_sendkey(String name,String val) {
	driver.findElement(By.name(name)).sendKeys(val);
	}

public void byid_click(String id) {
	driver.findElement(By.id(id)).click();
}

public void byname_click(String name) {
	driver.findElement(By.name(name)).click();
	}

public void byxpath_click(String xpstr) {
	driver.findElement(By.xpath(xpstr)).click();
}
public void byxpath_sendkey(String xpstr, String Val) {
	System.out.println("xpstr :" + xpstr + "Val :" + Val );
	driver.findElement(By.xpath(xpstr)).sendKeys(Val);
}



public void selectdropdown(String id, String vtxt) {
	Select month = new Select(driver.findElement(By.id(id)));
	month.selectByVisibleText(vtxt);
}

public void takesnap(String path) throws IOException{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File(path));
	}

public void searchtextcount(String tname) {
	
//	List<WebElement> links = driver.findElement(By.tagName(tname));
	List<WebElement> links = driver.findElements(By.tagName(tname));
	System.out.println("No. of links: " + links.size());
		//for (int i = 0; i <= links.size(); i = i + 1)
		//{
	
		//	System.out.println(links.get(i).getText());
		//}
	//public void closeapp() {
	//public void closeapp() {	
		driver.close();
	
	
	
}

 public void close() {
	 driver.close();
	
	
  }




	}


