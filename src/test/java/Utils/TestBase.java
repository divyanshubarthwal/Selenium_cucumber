package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	public WebDriver WebDriverManager() {
		
		if(driver==null) {
		 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}  return driver;
		
	}
}
