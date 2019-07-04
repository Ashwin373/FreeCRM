package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.SelectUrl;
import com.qa.crm.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	SelectUrl selecturl;
	
	@BeforeMethod
	public void SetUp() throws Throwable
	{
		initialization("chrome");
		 loginpage= new LoginPage();
		 homepage= new HomePage();
		 selecturl=new SelectUrl();
		
		selecturl.SelectEnv("Dev");
		Thread.sleep(4000);
		loginpage.ClickOnLogin();
		loginpage.loginCredentials("Dev");
	}
	

	@Test
	public void ContactsLink()
	{
		String HPtitleCheck =homepage.validateHomePageTitle();
		Assert.assertEquals(HPtitleCheck,"CRM");
		
		Boolean flag=homepage.validateUserNameLabel();
		Assert.assertTrue(flag);
		homepage.ClickOnContacts();
	}
	
	@AfterMethod
	public void teardown() throws Throwable
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
}
