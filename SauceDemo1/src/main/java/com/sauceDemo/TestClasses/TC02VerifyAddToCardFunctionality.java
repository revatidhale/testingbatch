package com.sauceDemo.TestClasses;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerPack.Listener.class)
public class TC02VerifyAddToCardFunctionality extends BaseClass {
	@Test
	public void addtocard()
	{
		System.out.println("product are add to card");
	}

}
