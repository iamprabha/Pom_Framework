package sauceDemo_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sauceDemo_Parent.Base;

public class Thanku_Page extends Base {

	/*
	 * public Thanku_Page() { PageFactory.initElements(driver, this); }
	 */

	
	@FindBy(xpath="//div[@id='checkout_complete_container']/h2")
	public   WebElement Thanku;
	
	
	
	
	public  String Final_msg()
	{
		return Thanku.getText();
		
		
	}
	
}
