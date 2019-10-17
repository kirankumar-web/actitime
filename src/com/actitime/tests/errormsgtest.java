package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Basetest;
import com.actitime.generic.exceldata;
import com.actitime.pages.loginpage;

public class errormsgtest extends Basetest
{
	@Test
	public void testerrmsg()
	{
	loginpage lip=new loginpage(driver);
	String un=exceldata.getdata(filepath, "TC02", 1, 0);
	lip.enterusername(un);
	String pw=exceldata.getdata(filepath, "TC02", 1, 1);
	lip.enterpassword(pw);
	lip.clickonlogin();
	String experrmsg = exceldata.getdata(filepath, "TC02", 1, 2);
	String aerrmsg = lip.verifyerrormsg();
	
	Assert.assertEquals(aerrmsg, experrmsg);
	Reporter.log("Error message is matching",true);
	
	}
}
