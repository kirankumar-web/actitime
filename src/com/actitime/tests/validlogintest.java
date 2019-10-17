package com.actitime.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generic.Basetest;
import com.actitime.generic.exceldata;
import com.actitime.pages.loginpage;
import com.actitime.pages.logoutpage;

public class validlogintest extends Basetest
{
   @Test(priority=1)
   public void testloginlogout() throws InterruptedException
   {
	   String user = exceldata.getdata(filepath, "TC01", 0, 0);
	   String password = exceldata.getdata(filepath, "TC01", 0, 1);
	   String title = exceldata.getdata(filepath, "TC01", 0, 2);
	   String logouttitle = exceldata.getdata(filepath, "TC01", 0, 3);
	   String eversion=exceldata.getdata(filepath, "TC01", 0, 4);
	 loginpage lip=new loginpage(driver);
	 logoutpage lop=new logoutpage(driver);
	 
	 lip.enterusername(user);
	 lip.enterpassword(password);
	 lip.clickonlogin();
	 lip.verifythetitle(title);
	 lop.clickonhelpicon();
	 lop.clickonaboutlink();
	 String actversion = lip.verifyversion();
	 Assert.assertEquals(actversion, eversion);
	 lop.clickonlogout();
	 Thread.sleep(2000);
     lip.verifythetitle(logouttitle);
 

	   
	
}
}
