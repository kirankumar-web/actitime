package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Basetest;
import com.actitime.generic.exceldata;
import com.actitime.pages.loginpage;

public class errormessagestest extends Basetest
{
	@Test
	public void testerrormessages()
	{
		loginpage lip=new loginpage(driver);
		int rc = exceldata.getrownum(filepath, "TC02");
		 System.out.println(rc);
		 for(int i=1;i<=rc;i++)
		 {
			 String username = exceldata.getdata(filepath, "TC02", i, 0);
			 String password = exceldata.getdata(filepath, "TC02", i, 1);
			 lip.enterpassword(username);
			 lip.enterpassword(password);
			 lip.clickonlogin();
			 String experrmsg = exceldata.getdata(filepath, "TC02", 1, 2);
			 String aerrmsg = lip.verifyerrormsg();
				
				Assert.assertEquals(aerrmsg, experrmsg);
				Reporter.log("Error message is matching",true);

		 }
	}

}
