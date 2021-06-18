/*
 * package PageObjects;
 * 
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.support.FindAll; import
 * org.openqa.selenium.support.FindBy; import
 * org.openqa.selenium.support.PageFactory; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * import CommonFunctions.Base;
 * 
 * public class Home_Page extends Base {
 * 
 * public Userrole_PageObjects_with_methods() { PageFactory.initElements(driver,
 * this); }
 * 
 * @FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b") public WebElement
 * adminlink;
 * 
 * 
 * @FindBy(linkText="User Management") public WebElement usernamanagement;
 * 
 * @FindBy(linkText="Users") public WebElement userslink;
 * 
 * 
 * 
 * 
 * public Actions mousehover() { Actions actions=new Actions(driver);
 * actions.moveToElement(adminlink); actions.moveToElement(usernamanagement);
 * actions.moveToElement(userslink); actions.build().perform(); return actions;
 * }
 * 
 * public System_Users_Page click_Admin_link() { adminlink.click(); return new
 * System_Users_Page(); }
 * 
 * }
 */