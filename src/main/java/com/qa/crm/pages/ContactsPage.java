package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement NewBtn;
	
	@FindBy(name="first_name")
	WebElement FirstName;
	
	@FindBy(name="last_name")
	WebElement LastName;
	
	@FindBy(name="middle_name")
	WebElement MiddleName;
	
	@FindBy(name="company")
	WebElement Company;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement SaveBtn;
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
			}
	
	public void ClickOnNewButton() {
		NewBtn.click();
		
	}
	
	public void FillDetails(String fname,String lname) {
		
		FirstName.sendKeys(fname);
		LastName.sendKeys(lname);
		SaveBtn.click();
	}

	
		
	}

