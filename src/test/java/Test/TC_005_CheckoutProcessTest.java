package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.CheckoutProcessPage;

public class TC_005_CheckoutProcessTest extends ProjectSpecificationMethods{

	@Test
	public void checkoutProcesstest() {
		CheckoutProcessPage obj = new CheckoutProcessPage(driver);
		obj.country()
		.city()
		.address()
		.zipCode()
		.phoneNumber()
		.continueButton()
		.shippingMethod();
	}
}
