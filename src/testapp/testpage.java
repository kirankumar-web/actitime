package testapp;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testpage
{
	@Test
	public void test1()
	{
		Reporter.log("executed test1",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("executed test2",true);
		int i=1/0;
	}
	@Test(retryAnalyzer=testapp.retryrun.class)
	public void test3()
	{
		Reporter.log("executed test3",true);
		Assert.fail();
	}
}
