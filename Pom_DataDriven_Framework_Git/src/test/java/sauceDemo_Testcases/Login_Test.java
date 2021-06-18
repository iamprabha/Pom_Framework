package sauceDemo_Testcases;

import org.testng.annotations.Test;

import sauceDemo_Pages.Products_Page;
import sauceDemo_Parent.Base;

public class Login_Test extends Base{

	Products_Page prod;
	
	@Test
	public void validate_login()
	{
		prod=login.validate_credentials("standard_user","secret_sauce");
	String title=login.validate_Title();
	System.out.println("title"+title);
	
	}
	
}
