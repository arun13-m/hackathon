package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.ProjectSpecificationMethods;

public class VerificationPage extends ProjectSpecificationMethods{

	public VerificationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage verification() {
		String expectedMSG = driver.findElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]")).getText();
		String actualMSG = "Your order has been successfully processed";
		
		//Assertion
		Assert.assertEquals(actualMSG, expectedMSG);
	
		//continue
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		return new HomePage(driver);
	}
}
