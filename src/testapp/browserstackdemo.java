package testapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class browserstackdemo
{
	public static final String USERNAME = "kirankumar97";
	  public static final String AUTOMATE_KEY = "1qbGNENH223sCWesWsS3";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception
	  {

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("os_version", "9.0");
	    caps.setCapability("device", "Samsung Galaxy S9 Plus");
	    caps.setCapability("real_mobile", "true");
	    caps.setCapability("project", "test");
	    caps.setCapability("build", "build1");
	    caps.setCapability("name", "test1");
	    caps.setCapability("browserstack.local", "false");
	    caps.setCapability("browserstack.debug", "true");
	    caps.setCapability("browserstack.appium_version", "1.7.1");

	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("facebook");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();

	  }
	}

