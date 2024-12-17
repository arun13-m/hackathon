package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.HomePage;

public class TC_001_RegisterTest extends ProjectSpecificationMethods {

    @Test
	public void registerTest() {
		HomePage obj = new HomePage(driver);
		obj.register()
		.gender()
		.firstName()
		.lastName()
		.date()
		.month()
		.year()
		.email()
		.passWord()
		.confirmPassword()
		.registerButton()
		.logout();
		
	}
	
	
	
}
