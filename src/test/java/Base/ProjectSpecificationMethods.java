package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility.Utilities;

public class ProjectSpecificationMethods extends Utilities {

	@BeforeMethod
	public void launchBrowserAndURL() {
		browserAndURL();
	}
	
	@AfterMethod
	public void closeBrowser() {
		browserClose();
	}
	
}
