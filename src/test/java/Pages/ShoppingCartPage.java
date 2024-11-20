package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Base.ProjectSpecificationMethods;

public class ShoppingCartPage extends ProjectSpecificationMethods{

	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public ShoppingCartPage removeItem() {
		driver.findElement(By.xpath("(//td[contains(@class,'remove-from-cart')])[2]")).click();
		driver.findElement(By.xpath("(//td[contains(@class,'remove-from-cart')])[3]")).click();
		return this;
	}
	
	public ShoppingCartPage addItemQuantity() {
		driver.findElement(By.id("quantity-up-11241")).click();
		return this;
	}
	
	public ShoppingCartPage estimateShipping() {
		driver.findElement(By.id("open-estimate-shipping-popup")).click();
		return this;
	}
	
	public ShoppingCartPage country() {
		ele = driver.findElement(By.name("CountryId"));
		Select s = new Select(ele);
		s.selectByVisibleText("India");
		return this;
	}
	
	public ShoppingCartPage pinCode() {
		driver.findElement(By.id("ZipPostalCode")).sendKeys("600028");
		return this;
	}
	
	public ShoppingCartPage shipMethod() {
		driver.findElement(By.xpath("//div[contains(text(),'Next Day Air')]")).click();
		return this;
	}
	
	public ShoppingCartPage apply() {
		driver.findElement(By.xpath("(//button[contains(text(),'Apply')])[1]")).click();
		return this;
	}
	
	public CheckoutProcessPage checkOut() {
		//terms
		driver.findElement(By.id("termsofservice")).click();
		
		//checkout
		driver.findElement(By.xpath("(//button[@type='submit'])[6]")).click();
		return new CheckoutProcessPage(driver);
	}
	
	
	
}




