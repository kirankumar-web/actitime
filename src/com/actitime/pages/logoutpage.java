package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.basepage;

public class logoutpage extends basepage
{
	@FindBy(xpath="//div[@class=\"popup_menu_button popup_menu_button_support\"]")
	private WebElement helpicon;
	
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement aboutlink;
	
	@FindBy(xpath="//span[.=\"(build 1032_35)\"]")
	private static WebElement bversion;  
	
	@FindBy(xpath="//a[@id=\"logoutLink\"]")
	private WebElement lgoutbtn;

	public logoutpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonhelpicon()
	{
		helpicon.click();
	}
	public void clickonaboutlink()
	{
		aboutlink.click();
	}
	
	public void clickonlogout()
	{
		lgoutbtn.click();
	}
	
	public String buildversion() {
		String actversion = bversion.getText();
		return actversion;
	}
	

}
