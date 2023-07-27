package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandingPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LandingPageStepDefinition {
	
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
		
		//System.setProperty("webdriver.chrome.driver", "D:/GRID/chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
		 testContextSetup.driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    
	}
	@When("user searched with shortname {string} and extracted actual name of project")
	public void user_searched_with_shortname_and_extracted_actual_name_of_project(String string) {
		
		LandingPage landingpage=new LandingPage(testContextSetup.driver);
		landingpage.searchItems(string);
		//testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
		 testContextSetup.landingPageProductName=  landingpage.getProductName().split("-")[0].trim();
	    System.out.println(landingPageProductName +"is extracted from Home Page");
	}
	
	

	
	







}
