package ecommerce_QA_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eCommerce_QA_ComonUtilities.Base;

public class Login_Page extends Base{
	
	public Login_Page()
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//*[@class='login']")
	public WebElement signin;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	public WebElement email;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	public WebElement passowrd;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]")
	public WebElement Login;
	
	@FindBy(xpath="//*[@id='email_create']")
	public WebElement create_account;
	
	@FindBy(xpath="//*[@id='SubmitCreate']")
	public WebElement SubmitCreate;
	
	
	public create_new_account_Page create_account(String a)
	{
		create_account.sendKeys(a);
		SubmitCreate.click();
		return new create_new_account_Page();
	}
	
	
	
	
}
