package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.SelectUrl;
import com.qa.crm.base.TestBase;
import com.qa.crm.pages.LoginPage;

public class LoginPageTest extends TestBase {

	SelectUrl selecturl;
	LoginPage loginpage;

	@BeforeMethod
	public void Setup() {
		initialization("chrome");
		loginpage = new LoginPage();
		selecturl = new SelectUrl();

		selecturl.SelectEnv("Dev");

	}

	@Test(priority = 1)
	public void LoginPageCheckTest() {
		boolean flag = loginpage.validateBrandLogo();
		System.out.println(flag);
		Assert.assertTrue(flag);

		String title = loginpage.validateLoginPagetitle();
		Assert.assertEquals(title, "Free CRM software for any Business");
	}

	
	@Test(priority=2) public void LoginTest() { loginpage.ClickOnLogin();
	 loginpage.loginCredentials("Dev"); }
	 

	@AfterMethod
	public void teardown() throws Throwable {
		Thread.sleep(5000);
		driver.quit();
	}
}
