package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.HomePage;

public class TC_008_LogoutTest extends ProjectSpecificationMethods {

	@Test
	public void logoutTest() {
		HomePage obj = new HomePage(driver);
		obj.logout();
		obj.browserClose();
	}
}
