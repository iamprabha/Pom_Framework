package PageObjects_Orange;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Info_Page {


@FindBy(xpath="//a[@id='menu_pim_viewMyDetails']")
public  WebElement MyInfo_Tab;

@FindBy(xpath="//div[@id='sidebar']/ul/li[2]")
public WebElement Contactslink;




public void selectuserrole()
{
	MyInfo_Tab.click();
}

}