package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchWindowByTitle {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver; 
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com/");
	   driver.get("https://the-internet.herokuapp.com/windows"); 
		
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement clickHereLink = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		
		clickHereLink.click(); 
		windowByTitle(driver, "New Window"); 
		
		Thread.sleep(3000); 
		
		windowByTitle(driver, "Amazon.com.Spen.less.Smile.more."); 
		
		
		

	}
	
	
	
	public static void windowByTitle( WebDriver driver , String title) {
		
		String currentWindow = driver.getWindowHandle(); 
		
		for (String windowName : driver.getWindowHandles()) { 
			
			System.out.println(windowName);
			System.out.println(driver.switchTo().window(windowName).getTitle());
			
			if(!driver.switchTo().window(windowName).getTitle().equals(title)) {
				
				driver.switchTo().window(currentWindow); 
			}
		}
	}

}
