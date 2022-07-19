package com.crm.proearn.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.proearn.genericutility.WebDriverUtility;

public class ContactsPage extends WebDriverUtility {
	
	WebDriver driver;
	public ContactsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createcontactimg;
	
	@FindBy(name="search_text")
	private WebElement searchtxt;
	
	@FindBy(id="bas_searchfield")
	private WebElement searchfield;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement verifycontact;
	
	@FindBy(xpath="//span[@class='genHeaderSmall']")
	private WebElement verifydelete;

	public WebElement getCreatecontactimg() {
		return createcontactimg;
	}

	public WebElement getSearchtxt() {
		return searchtxt;
	}

	public WebElement getSearchfield() {
		selectbyvalue(searchfield, "lastname");
		return searchfield;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getVerifycontact() {
		return verifycontact;
	}

	public WebElement getVerifydelete() {
		return verifydelete;
	}
	
	
}
