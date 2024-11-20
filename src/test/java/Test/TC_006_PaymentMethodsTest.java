package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.PaymentMethodsPage;

public class TC_006_PaymentMethodsTest extends ProjectSpecificationMethods{

	@Test
	public void paymentMethodsTest() {
		PaymentMethodsPage obj = new PaymentMethodsPage(driver);
		obj.selectCard()
		.cardInfo()
		.confirmOrder();
	}
}
