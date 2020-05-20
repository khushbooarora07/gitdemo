package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import resources.base;


public class hooks extends base {
	

	@After("@RegTests")
	public void closebrowser()
	{
		driver.close();
	}
	
	@After("@SmokeTests")
	public void closebrowsers()
	{
		driver.close();
	}

}
