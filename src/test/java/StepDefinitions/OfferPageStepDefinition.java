package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class OfferPageStepDefinition {
	
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@Then("user searched for {string} shortname in offers page to check if product exist with same name")
	public void user_searched_for_shortname_in_offers_page_to_check_if_product_exist_with_same_name(String string) throws InterruptedException {
		
		switchToOffersPage();
	   OffersPage offersPage=new OffersPage(testContextSetup.driver);
	    //driver.findElement(By.cssSelector(childWindow));
	    offersPage.searchItems(string);
	   
	   Thread.sleep(2000);
	    offerPageProductName=offersPage.getProductName();
	    
	}

	//loosely coupled method
	public void switchToOffersPage() {
		//if switched to offer page-?skip below part
		
		//if(testContextSetup.driver.getCurrentUrl().equals("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		LandingPage landingpage=new LandingPage(testContextSetup.driver);
		landingpage.selectTopDealsPage();
		
		testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
	    Set<String> s1=testContextSetup.driver.getWindowHandles();
	    Iterator<String> it=s1.iterator();
	    String parentWindow=it.next();
	    String childWindow=it.next();
	    
	    testContextSetup.driver.switchTo().window(childWindow);
	}

	
	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
	   Assert.assertEquals(offerPageProductName, landingPageProductName);
	}







}
