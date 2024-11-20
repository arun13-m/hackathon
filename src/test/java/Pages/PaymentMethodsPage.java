package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Base.ProjectSpecificationMethods;

public class PaymentMethodsPage extends ProjectSpecificationMethods {

	public PaymentMethodsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public PaymentMethodsPage selectCard() {
		driver.findElement(By.xpath("PaymentMethodsPage")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Continue')])[4]")).click();
		return this;
	}
	
	public PaymentMethodsPage cardInfo() {
		//holder_name
		driver.findElement(By.id("CardholderName")).sendKeys("Arun");
		//card_number
		driver.findElement(By.id("CardNumber")).sendKeys("4242424242424242");
		//exp_month
		ele = driver.findElement(By.id("ExpireMonth"));
		Select s = new Select(ele);
		s.selectByVisibleText("12");
		
		//exp_year
		ele = driver.findElement(By.id("ExpireYear"));
		s.selectByVisibleText("2034");
		
		//card_code
		driver.findElement(By.id("CardCode")).sendKeys("567");
		
		//continue
		driver.findElement(By.xpath("(//button[contains(text(),'Continue')])[5]")).click();
		return this;
	}
	
	public VerificationPage confirmOrder() {
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		return new VerificationPage(driver);
	}
	
	
}
