package sauceDemo_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemo_Parent.Base;

public class Products_Page extends Base{
	
	
	 public Products_Page()
	 {
		 PageFactory.initElements(driver, this); 
		 }
	 

	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	public   WebElement AddtoCart_button;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	public   WebElement  AddtoCart_link;
	
	
	public void click_addtocart_button()
	{
		AddtoCart_button.click();
		
	}
	
	public YourCart_Page AddtoCart_link()
	{
		AddtoCart_link.click();
		return new YourCart_Page();
		
	}
	
	
}
