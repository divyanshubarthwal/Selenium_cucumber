package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LandingPageStepDefinition {
	
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
		
		//System.setProperty("webdriver.chrome.driver", "D:/GRID/chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    
	}
	@When("user searched with shortname {string} and extracted actual name of project")
	public void user_searched_with_shortname_and_extracted_actual_name_of_project(String string) {
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
	    String landingPageProductName= driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	    System.out.println(landingPageProductName +"is extracted from Home Page");
	}
	
	

	
	







}
