package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods {

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public UserRegistrationPage register() {
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		return new UserRegistrationPage(driver);
	}
	
	public UserLoginPage login() {
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		return new UserLoginPage(driver);
	}
	
	public HomePage logout() {
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		return this;
	}
}
