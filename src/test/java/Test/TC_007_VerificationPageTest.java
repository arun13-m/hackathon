package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.VerificationPage;

public class TC_007_VerificationPageTest extends ProjectSpecificationMethods {

	@Test
	public void verificationMethodsTest() {
		VerificationPage obj = new VerificationPage(driver);
		obj.verification();
	}
}
