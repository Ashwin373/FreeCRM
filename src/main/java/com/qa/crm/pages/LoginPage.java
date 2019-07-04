package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;


public class LoginPage extends TestBase {
	
	
	@FindBy(xpath="//div[@class='rd-navbar-brand']/a[@title='free crm home']")
	public WebElement BrandLogo;
	
	@FindBy(xpath="//span[contains(text(),'sign up')]")
	WebElement SignUpButton;
		
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement AboutButton;
	
	@FindBy(xpath="//a[contains(text(),'Compare')]")
	WebElement CompareButton;
	
	@FindBy(xpath="//a[contains(text(),'Pricing')]")
	WebElement PricingButton;
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	public WebElement LoginButton;
	
	@FindBy(xpath="//img[contains(@src,'Android.png')]")
	WebElement AndroidButton;
	
	@FindBy(xpath="//img[contains(@src,'Itunes.png')]")
	WebElement ItunesButton;
	
	@FindBy(name="email")
	@CacheLookup
	WebElement Username;

	@FindBy(name="password")
	@CacheLookup
	WebElement Password;
	
	
	@FindBy(xpath="//div[@class=\"ui fluid large blue submit button\"]")
	WebElement LoginSubmitButton;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPagetitle()
	{
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public boolean validateBrandLogo()
	{
		return BrandLogo.isDisplayed();
	}
	
	public void ClickOnLogin()
	{
		LoginButton.click();
	}
	
	/*
	 * public void login(String un,String pw) { Username.sendKeys(un);
	 * Password.sendKeys(pw); LoginSubmitButton.click();
	 * 
	 * }
	 */
	
	public void loginCredentials(String env)
	{
		if(env.equals("Stage"))
		{
			Username.sendKeys(prop.getProperty("username"));
			Password.sendKeys(prop.getProperty("password"));
			LoginSubmitButton.click();
		}
		else if(env.equals("Dev"))
		{
			Username.sendKeys(prop.getProperty("username"));
			Password.sendKeys(prop.getProperty("password"));
			LoginSubmitButton.click();
		}
	}
	
}
