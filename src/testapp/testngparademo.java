package testapp;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngparademo 
{
	@Test
	@Parameters({"country","city"})
	public void testdemo(String country,String city)
	{
		Reporter.log(country,true);
		Reporter.log(city,true);

	}

}
