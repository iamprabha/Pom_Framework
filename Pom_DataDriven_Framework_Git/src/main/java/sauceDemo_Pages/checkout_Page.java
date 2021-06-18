package sauceDemo_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout_Page extends YourCart_Page {
	
	 public checkout_Page() 
	 { 
		 PageFactory.initElements(driver, this); 
		 }

	@FindBy(id="first-name")
	public   WebElement firstname;


	@FindBy(id="last-name")
	public   WebElement lastname;
	

	@FindBy(id="postal-code")
	public   WebElement postal_code;
	
	
	@FindBy (id="continue")
	public WebElement continue_button;
	
	public void checkout_Page_info()
	{
		firstname.sendKeys("spk");
		lastname.sendKeys("s");
		postal_code.sendKeys("123");
}
	public Overview_Page continue_button()
	{
		continue_button.click();
		return new Overview_Page();
	}
	
}