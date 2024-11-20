package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.HomePage;

public class TC_002_LoginTest extends ProjectSpecificationMethods{

	@Test
	public void loginTest() throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.login()
		.regEmail()
		.regPassword()
		.loginButton();
	}
}
