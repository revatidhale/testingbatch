package com.sauceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerPack.Listener.class)
public class TC01VerifyLoginFunctionanlity extends BaseClass 
{

	@Test
	public void verifyLogin()
	{
		String actalTitle = "Swag Labs";
		String expectedTitle = "Swag Labs";
		
		Assert.assertEquals(actalTitle, expectedTitle);
		Reporter.log("login test case is passed");
		
		//log
		log.info("Login test executed");
	
	}

}


