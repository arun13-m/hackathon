package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Base.ProjectSpecificationMethods;

public class CheckoutProcessPage extends ProjectSpecificationMethods {

	public CheckoutProcessPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public CheckoutProcessPage country() {
		ele = driver.findElement(By.name("BillingNewAddress.CountryId"));
		Select s = new Select(ele);
		s.selectByVisibleText("India");
		return this;
	}
	
	public CheckoutProcessPage city() {
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Chennai");
		return this;
	}
	
	public CheckoutProcessPage address() {
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Chennai, TamilNadu");
		return this;
	}
	
	public CheckoutProcessPage zipCode() {
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("600028");
		return this;
	}
	
	public CheckoutProcessPage phoneNumber() {
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9876543210");
		return this;
	}
	
	public CheckoutProcessPage continueButton() {
		driver.findElement(By.xpath("(//button[contains(@class,'button-1 new-address-next-step-button')])[1]")).click();
		return this;
	}
	
	public PaymentMethodsPage shippingMethod() {
		driver.findElement(By.xpath("//label[contains(text(),'Next Day Air ($0.00)')]")).click();
		return new PaymentMethodsPage(driver);
	}
	
}