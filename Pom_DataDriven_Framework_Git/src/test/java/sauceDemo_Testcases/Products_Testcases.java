package sauceDemo_Testcases;

import org.testng.annotations.Test;

import sauceDemo_Pages.Products_Page;
import sauceDemo_Pages.YourCart_Page;
import sauceDemo_Parent.Base;

public class Products_Testcases extends Base{

	Products_Page prod;
	YourCart_Page yc;
	
	@Test
	public void select_product()
	{
		prod=login.validate_credentials("standard_user","secret_sauce");
		prod.click_addtocart_button();
		yc=prod.AddtoCart_link();
		
	}
	
}
