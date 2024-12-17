package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ProjectSpecificationMethods;

public class UserLoginPage extends ProjectSpecificationMethods {

	public UserLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public UserLoginPage regEmail() throws InterruptedException {
		driver.findElement(By.id("Email")).sendKeys("arunm1234@gmail.com");
		return this;
	}
	
	public UserLoginPage regPassword() throws InterruptedException {
		driver.findElement(By.id("Password")).sendKeys("arun.1234");
		return this;
	}
	
	public ProductSearchAndBrowsingPage loginButton() {
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		return new ProductSearchAndBrowsingPage(driver);
	}
}
