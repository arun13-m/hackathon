package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.ShoppingCartPage;

public class TC_004_ShippingCartTest extends ProjectSpecificationMethods {

	@Test
	public void shipingCartTest() {
		ShoppingCartPage obj = new ShoppingCartPage(driver);
		obj.removeItem()
		.addItemQuantity()
		.estimateShipping()
		.country()
		.pinCode()
		.shipMethod()
		.checkOut();
	}
}
