package com.crm.proearn.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.proearn.genericutility.WebDriverUtility;

public class CreateNewCampaignPage extends WebDriverUtility {
	
	WebDriver driver;
	public CreateNewCampaignPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="campaignname")
	private WebElement campaignname;
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement clickproductimg;
	@FindBy(id="search_txt")
	private WebElement searchtxt;
	@FindBy(name="search_field")
	private WebElement searchfield;
	@FindBy(name="search")
	private WebElement search;
	@FindBy(name="button")
	private WebElement save;
	@FindBy(xpath="(//a[@href='javascript:window.close();'])[1]")
	private WebElement searchselect;

	public WebElement getCampaignname() {
		return campaignname;
	}

	public WebElement getClickproductimg() {
		return clickproductimg;
	}

	public WebElement getSearchtxt(String name) {
		swithToWindow(driver,name);
		return searchtxt;
	}

	public WebElement getSearchfield() {
		return searchfield;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public WebElement getSearchselect() {
		return searchselect;
	}

	public WebElement getSave() {
		return save;
	}
	
	public void searchselect() {
		search.click();
		searchselect.click();
	}
	
	public void save(String name) {
		swithToWindow(driver, name);
		save.click();
	}
}
