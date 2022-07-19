
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
public class HomePage extends WebDriverUtility {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement organizationmodule;
	
	@FindBy(linkText = "Contacts")
	//@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactmodule;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement productmodule;
	
	@FindBy(xpath="(//a[@href='javascript:;'])[1]")
	private WebElement more;
	
	@FindBy(name="Campaigns")
	private WebElement campaignmodule;
	
	@FindBy(xpath="(//a[text()='Purchase Order'])[1]")
	private WebElement purchaseorder;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signouticon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;

	public WebElement getOrganizationmodule() {
		return organizationmodule;
	}

	public WebElement getContactmodule() {
		return contactmodule;
	}

	public WebElement getProductmodule() {
		return productmodule;
	}
	
	public WebElement getMore() {
	mouseOverOnElement(driver, more);
		return more;
	}
	
	public WebElement getCampaignmodule() {
	//	mouseOverOnElement(driver, campaignmodule);
		return campaignmodule;
	}

	public WebElement getPurchaseorder() {
		return purchaseorder;
	}
	
	public WebElement getSignouticon() {
		return signouticon;
	}

	public WebElement getSignout() {
		return signout;
	}
/**
 * For signout to vtiger application create one signout method 
 * Extends the webdriverutility to getting webdriver methods
 * 
 */ 
	public void campaignmodule() {
		more.click();
		campaignmodule.click();
	}
		public void signout() {
		mouseOverOnElement(driver, signouticon);
		signouticon.click();
		signout.click();
	}
		
}
