/*
 * package PageObjects_Orange;
 * 
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.support.FindBy; import
 * org.openqa.selenium.support.PageFactory; import CommonFunctions.Base;
 * 
 * public class Login_Page extends Base {
 * 
 * // Initialize Page objects
 * 
 * public Login_Page() { PageFactory.initElements(driver, this); }
 * 
 * 
 * // Locators
 * 
 * @FindBy(id="txtUsername") public WebElement username;
 * 
 * @FindBy(id="txtPassword") public WebElement Password;
 * 
 * @FindBy(id="btnLogin") public WebElement LoginButton;
 * 
 * 
 * // methods
 * 
 * public Userrole_PageObjects_with_methods loginAction(String a,String b) {
 * 
 * username.sendKeys(a); Password.sendKeys(b); LoginButton.click();
 * System.out.println("success"); return new
 * Userrole_PageObjects_with_methods();
 * 
 * }
 * 
 * public String validate_Title() { return driver.getTitle(); }
 * 
 * 
 * }
 */