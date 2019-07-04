package com.qa.crm.base;

public class SelectUrl extends TestBase{
	
	
public void SelectEnv(String url)
	{
		switch(url)
		{
		case("Stage"):
			driver.get(prop.getProperty("StageFreeCRM_url"));
		break;
		case("Dev"):
			driver.get(prop.getProperty("DevFreeCRM_url"));
		break;
		
		}
	}
}
