package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.ProductSearchAndBrowsingPage;

public class TC_003_ProductSearchAndBrowsingTest extends ProjectSpecificationMethods {

	@Test
	public void productSearchAndBrowsing() {
		ProductSearchAndBrowsingPage obj = new ProductSearchAndBrowsingPage(driver);
		obj.searchItems()
		.selectItem()
		.shopingCart();
		
	}
	
}
