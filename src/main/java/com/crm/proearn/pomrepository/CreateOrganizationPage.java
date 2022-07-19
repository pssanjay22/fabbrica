package com.crm.proearn.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.proearn.genericutility.WebDriverUtility;

public class CreateOrganizationPage extends WebDriverUtility {
	WebDriver driver;
	public CreateOrganizationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement Orgimgbox;
	@FindBy(name="search_text")
	private WebElement searchtext;
	@FindBy(id="bas_searchfield")
	private WebElement searchfield;
	@FindBy(name="submit")
	private WebElement search;
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement verifyorg;
	
	public WebElement getOrgimgbox() {
		return Orgimgbox;
	}
	public WebElement getSearchtext() {
		return searchtext;
	}
	public WebElement getSearchfield() {
		selectbyvalue(Orgimgbox, "lastname");
		return searchfield;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getVerifyorg() {
	
		return verifyorg;
	}
	
	
}
