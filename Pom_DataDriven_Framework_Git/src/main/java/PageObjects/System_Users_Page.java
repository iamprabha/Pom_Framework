package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import CommonFunctions.Base;

public class System_Users_Page extends Base {

	public System_Users_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="searchSystemUser_userName")
	public  WebElement username;
	
	@FindBy(xpath="//select[@id='searchSystemUser_userType']")
	public  WebElement userrole;
	
	@FindBy(xpath="//select[@id='searchSystemUser_status']")
	public  WebElement userstatus;
	
	@FindBy(id="searchBtn")
	public  WebElement Searchbutton;
	
	@FindBy(xpath="//tr/td[1]")
	public  WebElement usernamevalue;
	
	@FindBy(xpath="//tr/td[3]")
	public  WebElement userrolevalue;
	
	@FindBy(xpath="//tr/td[5]")
	public  WebElement userstatusvalue;
	
	
	
	public Select selectuserrole()
	{
		Select selrole=new Select(userrole);
		selrole.selectByIndex(1);
		return selrole;
	}
	
	public Select selectstatus()
	{
		Select selstatus=new Select(userstatus);
		selstatus.selectByIndex(1);
		return selstatus;
	}
	public WebElement Searchbutton()
	{
		return Searchbutton;
	}
	
	public String userrolevalue()
	{
	return	userrolevalue.getText();
	}
	public String userstatusvalue()
	{
	return	userstatusvalue.getText();
	}
	
}
