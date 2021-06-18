package sauceDemo_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemo_Parent.Base;

public class YourCart_Page extends Base{

	
	
	  public YourCart_Page()
	  { 
		  PageFactory.initElements(driver, this); 
		  }
	 
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	public   WebElement Order_product_name;


	@FindBy(xpath="//button[@id='checkout']")
	public   WebElement checkout_button;
	

	
	public  String Order_product_name()
	{
		return Order_product_name.getText();
		
		
	}
	
	public checkout_Page Checkout_link()
	{
		checkout_button.click();
		return new checkout_Page();
		
	}
	
	
}
