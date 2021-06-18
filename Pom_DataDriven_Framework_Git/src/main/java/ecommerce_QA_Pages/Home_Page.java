package ecommerce_QA_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eCommerce_QA_ComonUtilities.Base;

public class Home_Page extends Base{
	
	public Home_Page()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@class='logo img-responsive']")
	WebElement logo;
	
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"searchbox\"]/child::input[4]")
	WebElement search;
	
	
	
	public boolean verify_logo()
	{
	return	logo.isDisplayed();
		
	}
	
	
	public Login_Page click_login()
	{
		signin.click();
		return new Login_Page();
		
	}
	
}
