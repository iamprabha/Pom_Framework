package eCommerce_QA_ComonUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ecommerce_QA_Pages.Home_Page;
import ecommerce_QA_Pages.Login_Page;




public class Base {

public static Properties properties;

public static WebDriver driver;
public Home_Page home;
// Logger logger=Logger.getLogger(Base.class);

	
	public Properties loadProperties() throws IOException
	{
		// property file need to fetch
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/Config.properties");
		properties=new Properties();
		properties.load(fis);
		return properties;
		
	}
	
	@BeforeMethod
	public void launch_browser() throws IOException
	
	{
	//	logger.info("loading property file");
	//	PropertyConfigurator.configure("log4j.properties");
		loadProperties();
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driver_location=properties.getProperty("Driver_location");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",driver_location);
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",driver_location);
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		home=new Home_Page();
	
		
		
	}
	
	@AfterSuite
	public void teardown()
	{
	//	driver.quit();
	}
}
