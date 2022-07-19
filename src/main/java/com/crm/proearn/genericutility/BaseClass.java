package com.crm.proearn.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.crm.proearn.pomrepository.HomePage;
import com.crm.proearn.pomrepository.LoginPage;

public class BaseClass {

	FileUtility fLib=new FileUtility();
	ExcelUtility eLib=new ExcelUtility();
	WebDriverUtility wLib=new WebDriverUtility();
	JavaUtility jLib=new JavaUtility();

	public WebDriver driver;
	public static WebDriver sdriver;
	
	//open the browser
	//@Parameters("Browser")
	@BeforeClass(groups = {"SmokeTest","RegressionTest"})
	public void lunchBrowser(/*String Browser*/)
	{
		//String Browser = System.getProperty("BROWSER");
		/*if(Browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(Browser.equalsIgnoreCase("ie")) {
			driver=new InternetExplorerDriver();
		}else {
			driver=new ChromeDriver();
		}*/
		
		driver=new ChromeDriver();
		sdriver=driver;
		wLib.waitForElementInDOM(driver);
	}

	//login to vtiger
	@BeforeMethod(groups = {"SmokeTest","RegressionTest"})
	public void login() throws Throwable
	{
		String url = fLib.getPropertyKeyValue("url");
		String un = fLib.getPropertyKeyValue("un");
		String pwd = fLib.getPropertyKeyValue("pwd");
		driver.get(url);
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(url, un, pwd);
	}

	//logout from vtiger
	@AfterMethod(groups = {"SmokeTest","RegressionTest"})
	public void logout()
	{
		HomePage hp=new HomePage(driver);
		hp.signout();
	}

	//close all the browsers
	@AfterClass(groups = {"SmokeTest","RegressionTest"})
	public void closeBrowser()
	{
		driver.quit();
	}
}
