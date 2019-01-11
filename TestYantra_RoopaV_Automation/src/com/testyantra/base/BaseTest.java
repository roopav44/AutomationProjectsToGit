package com.testyantra.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

public class BaseTest  {
	public Logger log;
	public WebDriver driver;
	
	public static void initalize(){
		
	}
	
	@Parameters({"browser"})
	public void openBrowser(String browser){
		log.info("Opening browser:"+browser);
		if(browser.equals("chrome")){
			driver = new ChromeDriver();
		}
		else{
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void closeBrowser(){
		log.info("Closing Browser");
		driver.quit();
	}
	
	public void getElement(WebDriver driver, String locator)
	{
		
	}
	
	public void openUrl(){
		
		
	}
	
	

}
