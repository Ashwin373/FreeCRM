package com.qa.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.crm.utility.TestUtil;
import com.qa.crm.utility.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase()
	{
		try
		{
			prop =new Properties();
			FileInputStream ip =new FileInputStream("C:\\Users\\user\\eclipse-workspace\\CRM\\src\\main\\java\\com\\qa\\crm\\config\\config.properties");
			prop.load(ip);
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		} 
	}		
	
	public static void initialization(String BrowserName) {
		//String BrowserName=prop.getProperty("browser");
		
		if(BrowserName.equals(prop.getProperty("Chromebrowser")))
		{
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");    //Location
    driver =new ChromeDriver();
	}
		else if(BrowserName.equals(prop.getProperty("Firefoxbrowser")))
		{
System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\geckodriver.exe");    //Location
driver =new FirefoxDriver();
		}
		
		e_driver=new EventFiringWebDriver(driver);
		eventListener= new WebEventListener();
		e_driver.register(eventListener);
		driver =e_driver;
		
		
		driver.manage().deleteAllCookies();   		//deletes all the Cookies
		driver.manage().window().maximize(); 
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		
		//driver.get(prop.getProperty("url"));
		
		
		
	
		
		
}
}