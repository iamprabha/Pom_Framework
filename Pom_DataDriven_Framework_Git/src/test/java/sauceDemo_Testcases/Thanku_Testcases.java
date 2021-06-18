package sauceDemo_Testcases;

import org.testng.annotations.Test;

import sauceDemo_Pages.Overview_Page;
import sauceDemo_Pages.Products_Page;
import sauceDemo_Pages.Thanku_Page;
import sauceDemo_Pages.YourCart_Page;
import sauceDemo_Pages.checkout_Page;
import sauceDemo_Parent.Base;

public class Thanku_Testcases extends Base {



	
	
	Products_Page prod;
	YourCart_Page yc;
	checkout_Page cp;
	Overview_Page ov;
	Thanku_Page Thanku;


	@Test
	public void select_product()
	{
		prod=login.validate_credentials("standard_user","secret_sauce");
		prod.click_addtocart_button();
		yc=prod.AddtoCart_link();
		cp=yc.Checkout_link();
		cp.checkout_Page_info();
		ov=cp.continue_button();
		String name=ov.Order_product_name();
		System.out.println(name);
		Thanku=ov.click_Finish_Button();
	
}

	
	
}
