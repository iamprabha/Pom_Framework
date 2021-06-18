package Orange_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonFunctions.Base;
import CommonFunctions.DataDriven;
import PageObjects_Orange.Home_Page;



public class Login_Test extends Base {

Home_Page home_page;
String[][] a;

//@DataProvider(name="Datastep")
	@Test(dataProvider="Datastep")
	
	public void login_test_validate(String username,String pwd,String c,String D) {
		
		//home_page=login.loginAction(properties.getProperty("username"),properties.getProperty("password"));
    	home_page=login.loginAction(username,pwd);
		String actual=login.validate_Title();
		System.out.println(actual);
		Assert.assertEquals(actual, "OrangeHRM");
	}
	
	@Test
	
	public void login_invalid_validate() {
		
		home_page=login.loginAction("hello","hello2");
	}
	
	@DataProvider
	public  String[][] Datastep() throws IOException
	{
		 a=DataDriven.read_Data_from_Excel();
		return a;
	}
	
	@AfterTest
	public void tear()
	{
		driver.close();
	}

}
