package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Base.ProjectSpecificationMethods;

public class UserRegistrationPage extends ProjectSpecificationMethods{

	public UserRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public UserRegistrationPage gender() {
		driver.findElement(By.id("gender-male")).click();
		return this;
	}
	
	public UserRegistrationPage firstName() {
		driver.findElement(By.id("FirstName")).sendKeys("Arun");
		return this;
	}
	
	public UserRegistrationPage lastName() {
		driver.findElement(By.id("LastName")).sendKeys("M");
		return this;
	}
	
	public UserRegistrationPage date() {
		ele = driver.findElement(By.name("DateOfBirthDay"));
		Select s = new Select(ele);
		s.selectByValue("5");	
		return this;
	}
	
	public UserRegistrationPage month() {
		ele = driver.findElement(By.name("DateOfBirthMonth"));
		Select s1 = new Select(ele);
		s1.selectByValue("4");
		return this;
	}
	
	public UserRegistrationPage year() {
		ele = driver.findElement(By.name("DateOfBirthYear"));
		Select s2 = new Select(ele);
		s2.selectByVisibleText("1997");
		return this;
	}
	
	public UserRegistrationPage email() {
		driver.findElement(By.id("Email")).sendKeys("arunm1234@gmail.com");
		return this;
	}
	
	public UserRegistrationPage passWord() {
		driver.findElement(By.id("Password")).sendKeys("arun.1234");
		return this;
	}
	
	public UserRegistrationPage confirmPassword() {
		driver.findElement(By.id("ConfirmPassword")).sendKeys("arun.1234");
		return this;
	}
	
	public UserRegistrationPage registerButton() {
		driver.findElement(By.id("register-button")).click();
		return this;
	}
	
	public HomePage logout() {
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		return new HomePage(driver);
	}
	
	
	
}
