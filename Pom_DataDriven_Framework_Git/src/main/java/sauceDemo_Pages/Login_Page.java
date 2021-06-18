package sauceDemo_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemo_Parent.Base;


public class Login_Page extends Base {

	// Initialize Page objects
	
	public Login_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(id="user-name")
	public   WebElement username;
	
	@FindBy(id="password")
	public   WebElement  Password;
	
	@FindBy(id="login-button")
	public  WebElement LoginButton;


	// methods

public Products_Page validate_credentials(String a,String b)
{
	
	username.sendKeys(a);
	Password.sendKeys(b);
	LoginButton.click();
	System.out.println("success");
	return new Products_Page();
	
}

public String validate_Title()
{
	return driver.getTitle();
}




}