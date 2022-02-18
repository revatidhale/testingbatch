package com.sauceDemo.TestClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

import com.sauceDemo.POMClasses.HomePageClass;
import com.sauceDemo.POMClasses.LoginPageClass;

public class BaseClass {
	WebDriver driver;
	LoginPageClass login;
	
	Logger log;

	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"D:\\Back-up Data\\Desktop-Backup\\Pavan Velo\\Automation Batch Material\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver =  new ChromeDriver();	
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"D:\\Back-up Data\\Desktop-Backup\\Pavan Velo\\Automation Batch Material\\Downloads\\chromedriver_win32\\geckodriver.exe");
			
			driver =  new FirefoxDriver();	
		}
		else
		{
//			System.setProperty("webdriver.chrome.driver", 
//				"D:\\Back-up Data\\Desktop-Backup\\Pavan Velo\\Automation Batch Material\\Downloads\\chromedriver_win32\\geckodriver.exe");
		
//		driver =  new FirefoxDriver();	
			
		}
		
		log = Logger.getLogger("MPP");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		log.info("URl is opened");
		
		
		login = new LoginPageClass(driver);
		login.sendUsername();
		log.info("username entered");
		login.sendPassword();
		log.info("password entered");
		login.clickLoginButton();
		log.info("clicked on login button");
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}