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
public class CampaignPage extends WebDriverUtility{
	
	WebDriver driver;
	public CampaignPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement createnewcamp;
	@FindBy(name="search_text")
	private WebElement serachtext;
	@FindBy(id="bas_searchfield")
	private WebElement searchfield;
	@FindBy(name="submit")
	private WebElement save;
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement verifytext;

	public WebElement getCreatenewcamp() {
		return createnewcamp;
	}
	public WebElement getSerachtext() {
		return serachtext;
	}
	public WebElement getSearchfield() {
		return searchfield;
	}
	public WebElement getSave() {
		return save;
	}
	
	public WebElement getVerifytext() {
		return verifytext;
	}
}
