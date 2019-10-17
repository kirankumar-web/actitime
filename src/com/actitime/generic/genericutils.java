package com.actitime.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class genericutils
{
  public static void getscreenshot(WebDriver driver,String name)
  {
	  try
	  {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".src\\screenshot"+name+".png");
		FileUtils.copyFile(src, dest);
		}
	  catch (Exception e)
	  {
		
	}
  }
    public void selectbyvalue(WebElement ele,String value)
      {
	  Select sel=new Select(ele);
	  sel.selectByValue(value);
	  }  
    public void selectbyindex(WebElement ele,int index)
      {
 	  Select sel=new Select(ele);
 	  sel.selectByIndex(index);
 	  } 
    public void selectbytext(WebElement ele,String text)
      {
	  Select sel=new Select(ele);
	  sel.selectByValue(text);
	  }
}
