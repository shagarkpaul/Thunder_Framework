package common;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class googleBase {
	
	protected WebDriver driver; 
	
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.get("https://www.google.com/"); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
	}
	
	public void closeAll() {
		driver.quit();
	}
	
	public void closeCurrent() {
		driver.close(); 
	}
	
	
	
	
}
