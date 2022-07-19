package com.crm.proearn.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.proearn.genericutility.WebDriverUtility;
/**
 * 
 * @author Sanjay
 *
 */
public class LoginPage extends WebDriverUtility{
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name="user_name")
	private WebElement untbx;
	
	@FindBy (name="user_password")
	private WebElement pwdtbx;
	
	@FindBy (id="submitButton")
	private WebElement lgnbtn;

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwdtbx() {
		return pwdtbx;
	}

	public WebElement getLgbtn() {
		return lgnbtn;
	}
	/**
	 * To login to vtiger application create logintoapp method and give below parameters
	 * @param url
	 * @param username
	 * @param password
	 */
	public void loginToApp(String url,String username,String password) {
		driver.get(url);
		untbx.sendKeys(username);
		pwdtbx.sendKeys(password);
		lgnbtn.click();
		waitForElementInDOM(driver);
	}
	
}
