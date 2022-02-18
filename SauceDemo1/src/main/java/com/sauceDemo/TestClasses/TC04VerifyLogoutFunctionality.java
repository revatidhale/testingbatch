package com.sauceDemo.TestClasses;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerPack.Listener.class)
public class TC04VerifyLogoutFunctionality extends BaseClass{
	
@Test
public void Logoutfunctionality()
{
System.out.println("logout test is passed");
}
}