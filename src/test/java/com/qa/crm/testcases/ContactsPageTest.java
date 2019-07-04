package com.qa.crm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.crm.base.SelectUrl;
import com.qa.crm.base.TestBase;
import com.qa.crm.pages.ContactsPage;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;
import com.qa.crm.utility.TestUtil;

public class ContactsPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	SelectUrl selecturl;
	ContactsPage contactspage;
	String sheetName="Contacts";
	
	@BeforeMethod
	public void SetUp() throws Throwable
	{
		initialization("chrome");
		 loginpage= new LoginPage();
		 homepage= new HomePage();
		 selecturl=new SelectUrl();
		 contactspage =new ContactsPage();		
		selecturl.SelectEnv("Dev");
		Thread.sleep(5000);
		loginpage.ClickOnLogin();
		loginpage.loginCredentials("Dev");
	}
	
	@DataProvider
	public Object[][] getCRMTestData()
	{
		Object data[][]= TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getCRMTestData")
	public void AddNewContacts(String firstname,String lastname) {
		
		homepage.ClickOnContacts();
		contactspage.ClickOnNewButton();
		//contactspage.FillDetails("arab", "khan");
		contactspage.FillDetails(firstname, lastname);
		
	}
	
	
	
	
	
	@AfterMethod
	public void teardown() throws Throwable
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
}
