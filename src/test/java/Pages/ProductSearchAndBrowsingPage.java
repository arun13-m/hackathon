package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ProjectSpecificationMethods;

public class ProductSearchAndBrowsingPage extends ProjectSpecificationMethods {

	public ProductSearchAndBrowsingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public ProductSearchAndBrowsingPage searchItems() {
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		return this;
	}
	
	public ProductSearchAndBrowsingPage selectItem() {
		driver.findElement(By.xpath("(//button[contains(@class,'button-2 product-box-add-to-cart-button')])[1]")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'button-2 product-box-add-to-cart-button')])[2]")).click();
		return this;
	}
	
	public ShoppingCartPage shopingCart() {
		driver.findElement(By.className("cart-label")).click();
		return new ShoppingCartPage(driver);
	}
}
