package ecommerce_QA_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import eCommerce_QA_ComonUtilities.Base;

public class create_new_account_Page extends Base {
	
	public create_new_account_Page()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//*[@id=\"id_gender1\"]")
	public WebElement Salutation;
	
	
	@FindBy(xpath="//*[@id=\"customer_firstname\"]")
	public WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"customer_lastname\"]")
	public WebElement lastname;
	
	@FindBy(xpath="//*[@id='passwd']")
	public WebElement Password;
	
	@FindBy(xpath="//*[@id='days']")
	public WebElement Date;
	
	@FindBy(xpath="//*[@id='months']")
	public WebElement Months;
	
	@FindBy(xpath="//*[@id='years']")
	public WebElement Year;
	
	@FindBy(xpath="//*[@id='firstname']")
	public WebElement Firstname;
	
	
	@FindBy(xpath="//*[@id='lastname']")
	public WebElement Lastname;
	
	
	@FindBy(xpath="//*[@id='company']")
	public WebElement Company;
	
	
	@FindBy(xpath="//*[@id='address1']")
	public WebElement Address1;
	
	
	@FindBy(xpath="//*[@id='address2']")
	public WebElement Address2;

	@FindBy(xpath="//*[@id='city']")
	public WebElement City;
	
	
	@FindBy(xpath="//*[@id='id_state']")
	public WebElement State;
	
	
	@FindBy(xpath="//*[@id='postcode']")
	public WebElement Postcode;
	
	
	@FindBy(xpath="//*[@id='id_country']")
	public WebElement Country;
	
	
	@FindBy(xpath="//*[@id='other']")
	public WebElement Additional_Info;
	
	@FindBy(xpath="//*[@id='phone']")
	public WebElement Phone;
	
	
	@FindBy(xpath="//*[@id='phone_mobile']")
	public WebElement Mobile;
	
	
	@FindBy(xpath="//*[@id='alias']")
	public WebElement Assign_address;
	
	
	@FindBy(xpath="//*[@id='submitAccount']")
	public WebElement Register_Button;
	
	
	  public void Select_action(WebElement date2,String value)
	  { 
		  Select dropdown=new Select(date2);
		  dropdown.selectByValue(value);
	  }
	  
	  public void Select_action_visible(WebElement date2,String value)
	  { 
		  Select dropdown=new Select(date2);
		  dropdown.selectByVisibleText(value);
	  }
	 
	 
	
	
	public void Personal_info(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l,String m,String n,String o,String p,String q)
	{
		firstname.sendKeys(a);
		lastname.sendKeys(b);
		Password.sendKeys(c);
		Select_action(Date,d);
		Select_action(Months,e);
		Select_action(Year,f);
		Company.sendKeys(g);
		Address1.sendKeys(h);
		Address2.sendKeys(i);
		City.sendKeys(j);
		Select_action_visible(State,k);
		Postcode.sendKeys(l);
		Select_action_visible(Country,m);
		Additional_Info.sendKeys(n);
		Mobile.sendKeys(o);
		Phone.sendKeys(p);
		Assign_address.sendKeys(q);
		
		
	}
	
	

}
