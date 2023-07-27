package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	public WebDriver driver;
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}
	By search=By.xpath("//input[@type='search'");
	By productName=By.cssSelector("tr td:nth-child(1)");
	
	public void searchItems(String string) {
		 driver.findElement(search).sendKeys(string);
		}
	
	public void getItems(String string) {
		driver.findElement(search).getText();
	}
	
	public String getProductName() {
	return driver.findElement(productName).getText();
}
	
	
	
	
}
