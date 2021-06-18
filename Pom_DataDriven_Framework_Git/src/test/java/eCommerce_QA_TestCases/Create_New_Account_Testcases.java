package eCommerce_QA_TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonFunctions.DataDriven;
import eCommerce_QA_ComonUtilities.Base;
import ecommerce_QA_Pages.Login_Page;
import ecommerce_QA_Pages.create_new_account_Page;



public class Create_New_Account_Testcases extends Base {
	Object dd[][];
	Login_Page Login_page;
	create_new_account_Page cret;
	
	@Test(dataProvider="datasetup")
	public void personal_info(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l,String m,String n,String o,String p,String q)
	{
	Login_page=	home.click_login();
	//cret= Login_page.sign_in_click();
	cret=Login_page.create_account("xyzabc@gmail.com");
		// cret.Personal_info("prabhu", "karan", "12345", "21","5","2021","san","addr1","addr2","city1","Florida","1234","United States","Test","12345","22222","adddd");
	cret.Personal_info(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q);
	}

	
	@DataProvider
	public Object[][] datasetup() throws IOException
	{
		
		dd=DataDriven.read_Data_from_Excel();
		return dd;
	}
	
}
