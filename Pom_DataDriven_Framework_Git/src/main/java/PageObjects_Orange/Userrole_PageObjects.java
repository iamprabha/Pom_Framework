package PageObjects_Orange;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Userrole_PageObjects {

	@FindBy(id="searchSystemUser_userName")
	public static WebElement username;
	
	@FindBy(id="searchSystemUser_userType")
	public static WebElement userrole;
	
	@FindBy(id="searchSystemUser_status")
	public static WebElement userstatus;
	
	@FindBy(id="searchBtn")
	public  WebElement Searchbutton;
	
	@FindBy(xpath="//tr/td[3]")
	public static WebElement userrolevalue;
	
	@FindBy(xpath="//tr/td[5]")
	public static WebElement userstatusvalue;
	
	@FindBy(linkText="Admin")
	public static WebElement adminlink;
	
	@FindBy(linkText="User Management")
	public static WebElement usernamanagement;
	
	@FindBy(linkText="Users")
	public static WebElement userslink;
	
	
	
	
}
