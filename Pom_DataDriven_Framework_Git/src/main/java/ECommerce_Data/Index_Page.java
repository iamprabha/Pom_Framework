package ECommerce_Data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemo_Parent.Base;

public class Index_Page extends Base{

	
	public Index_Page()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	 public  WebElement adminlink;
	
	
	@FindBy(linkText="User Management")
	public  WebElement usernamanagement;
	
	@FindBy(linkText="Users")
	public  WebElement userslink;
	
	//*[@id="header_logo"]/a/img
	

	
	
}
