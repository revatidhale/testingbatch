package com.sauceDemo.TestClasses;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerPack.Listener.class)
public class TC03VerifyMenuBar extends BaseClass{
@Test
public void verifymenubar()
{
	System.out.println("open menu successfully");
}

}
