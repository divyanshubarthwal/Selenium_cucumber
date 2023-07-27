package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	By search=By.xpath("//input[@type='search'");
	By productName=By.cssSelector("tr td:nth-child(1)");
	By topDeals=By.linkText("Top Deals");
	
	public void searchItems(String string) {
		 driver.findElement(search).sendKeys(string);
		}
	
	public void getItems(String string) {
		driver.findElement(search).getText();
	}
	public void selectTopDealsPage() {
		driver.findElement(topDeals)
.click();	}
	public String getProductName() {
	return driver.findElement(productName).getText();
}
	
	
}


