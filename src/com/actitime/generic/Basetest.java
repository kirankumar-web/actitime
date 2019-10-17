package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Basetest implements autoconstants
{
	public WebDriver driver;
	static
	{
		System.setProperty(chromekey, chromevalue);
		System.setProperty(firefoxkey,firefoxvalue);
	}
	@BeforeMethod
  public void precondition()
  {
	  driver=new ChromeDriver();
		//driver=new FirefoxDriver();
	  driver.get("https://demo.actitime.com/login.do");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
	@AfterMethod
  public void postcondition(ITestResult res) 
  {
	 int status = res.getStatus(); 
	 if(status==2)
	 {
		String name = res.getName();
		genericutils.getscreenshot(driver, name);
		
		System.out.println(name);
	 }
	 driver.close();
  }
}
