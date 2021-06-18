package Orange_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.Base;
import PageObjects_Orange.Home_Page;


public class Home_Page_Testcase extends Base {
	

	Home_Page homepage;


	
		@Test
		public void admin_link_validation()
		{
			homepage=login.loginAction(properties.getProperty("username"),properties.getProperty("password"));
			homepage.click_Admin_link();
			String expected_url=driver.getCurrentUrl();
			Assert.assertEquals(expected_url, "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		}
	}

	
	

