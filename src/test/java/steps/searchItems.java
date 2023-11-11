package steps;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHomePage;

public class searchItems extends googleBase{
	

	googleHomePage gp; 
	
	@Given("i am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowser();
		
		// i love uuuuuuuuuuuuuuuuuuuuuuu 
		
		// sdfgherigfhebrhfgsebrlhfgaeihhbaslhfba
		
	}

	@When("i enter the {string} in the search bar")
	public void i_enter_the_in_the_search_bar(String string) {
	  
		gp = new googleHomePage(driver);
		gp.enterProduct(string);
		
		
		
	}

	@When("i click on the search button")
	public void i_click_on_the_search_button() {
	   
		gp = new googleHomePage(driver);
		gp.clickOnSearchButton();
	}
	
	

	@Then("I can see the search results successfully")
	public void i_can_see_the_search_results_successfully() {
		
		gp = new googleHomePage(driver);
		
		Assert.assertTrue(gp.verifySearchResultIsDisplayed());
		
		
	   closeAll(); 
		
	}

}
