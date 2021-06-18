package PageObjects_Orange;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Pom {
	
	@FindBy(id="txtUsername")
	public static  WebElement username;
	
	@FindBy(id="txtPassword")
	public static  WebElement  Password;
	
	@FindBy(id="btnLogin")
	public static WebElement LoginButton;

}
