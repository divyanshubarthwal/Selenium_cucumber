package Utils;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

//variable or propertiies which we gonna share with another step definition file
public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() {
		testBase=new TestBase();
		pageObjectManager= new PageObjectManager(testBase.WebDriverManager());
		genericUtils=new GenericUtils(testBase.WebDriverManager());
	}
}
