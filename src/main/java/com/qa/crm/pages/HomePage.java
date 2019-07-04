package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.crm.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Ashwin Devadiga')]")
	WebElement UserNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement HomeBtn;
	
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement CalendarBtn;

	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement ContactsBtn;
	
	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement CompaniesBtn;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement DealsBtn;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement TasksBtn;
	
	@FindBy(xpath="//span[contains(text(),'Cases')]")
	WebElement CasesBtn;
	
	@FindBy(xpath="//span[contains(text(),'Documents')]")
	WebElement DocumentsBtn;
	
	@FindBy(xpath="//span[contains(text(),'Calls')]")
	WebElement CallsBtn;
	
	@FindBy(xpath="//span[contains(text(),'Email')]")
	WebElement EmailBtn;
	
	@FindBy(xpath="//span[contains(text(),'Campaigns')]")
	WebElement CampaignsBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Boolean validateUserNameLabel()
	{
		Boolean UNL=UserNameLabel.isDisplayed();
		return UNL;
	}

	public String validateHomePageTitle()
	{
		String HomepageTitle=driver.getTitle();
		Assert.assertEquals(HomepageTitle,"CRM");
		return HomepageTitle;
	}
	
	public void ClickOnCompanies()
	{
		CompaniesBtn.click();
	}
	
	public void ClickOnCalendar()
	{
		CalendarBtn.click();
	}
	
	public void ClickOnDeals()
	{
		DealsBtn.click();
	}
	
	public void ClickOnTasks()
	{
		TasksBtn.click();
	}
	
	public void ClickOnCases()
	{
		CasesBtn.click();
	}
	
	public void ClickOnDocuments()
	{
		DocumentsBtn.click();
	}
	
	public void ClickOnCalls()
	{
		CallsBtn.click();
	}
	
	public void ClickOnEmail()
	{
		EmailBtn.click();
	}
	
	public void ClickOnCampaigns()
	{
		CampaignsBtn.click();
	}
	
	public void ClickOnContacts()
	{
		ContactsBtn.click();
	}
	
	public void ClickOnHome()
	{
		HomeBtn.click();
	}
}
