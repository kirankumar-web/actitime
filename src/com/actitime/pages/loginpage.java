package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.basepage;

public class loginpage extends basepage
{
	@FindBy(id="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pwtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	@FindBy(xpath="//span[contains(text(),'Username ')]")
	private WebElement errmsg;
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
	

	public loginpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void verifythetitle(String etitle)
	{
		verifytitle(etitle);
	}
	public void enterusername(String un)
	{
		untb.sendKeys(un);
	}
	public void enterpassword(String pw)
	{
		pwtb.sendKeys(pw);
	}
	public void clickonlogin()
	{
		lgbtn.click();
	}
	public String verifyerrormsg()
	{
		verifyelement(errmsg);
		String aermsg = errmsg.getText();
		return aermsg;
	}
	public String verifyversion()
	{
		verifyelement(version);
		String aversion = version.getText();
		return aversion;
	}
}
