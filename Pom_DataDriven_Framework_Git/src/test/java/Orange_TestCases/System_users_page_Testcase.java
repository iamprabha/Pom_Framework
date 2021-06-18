package Orange_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.Base;
import PageObjects_Orange.Home_Page;
import PageObjects_Orange.System_Users_Page;

public class System_users_page_Testcase extends Base {

	Home_Page homepage;
	System_Users_Page system;
	
	@Test
	public void validate_userrole_uservalue_dropdown()
	{
		homepage=login.loginAction(properties.getProperty("username"),properties.getProperty("password"));
		system=homepage.click_Admin_link();
		system.selectuserrole();
		system.selectstatus();
		system.Searchbutton();
		String userroleval=system.userrolevalue();
		String userstatusval=system.userstatusvalue();
		Assert.assertEquals(userroleval, "Admin");
		Assert.assertEquals(userstatusval, "Enabled");
		
		
		
	}
	
}
	
	
	
	

