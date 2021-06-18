package sauceDemo_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemo_Parent.Base;

public class Overview_Page extends Base {

	
	 public Overview_Page() 
	 { 
		 PageFactory.initElements(driver, this); 
		 }
	 
	@FindBy(xpath="//div[@class='inventory_item_name']")
	public   WebElement Order_product_name;
	
	
	@FindBy(id="finish")
	public   WebElement Finish_Button;
	
	
	
	
	public  String Order_product_name()
	{
		return Order_product_name.getText();
		
		
	}
	
	public  Thanku_Page click_Finish_Button()
	{
		Finish_Button.click();
		return new Thanku_Page();
		
	}
	
}
