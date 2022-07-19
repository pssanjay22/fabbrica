package com.crm.proearn.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.proearn.genericutility.WebDriverUtility;

public class CreateProductPage extends WebDriverUtility {

	WebDriver driver;
	public CreateProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createproductimg;
	@FindBy(name="search_text")
	private WebElement searchtext;
	@FindBy(id="bas_searchfield")
	private WebElement searchfield;
	@FindBy(name="submit")
	private WebElement submit;
	
	public WebElement getCreateproductimg() {
		return createproductimg;
	}
	public WebElement getSearchtext() {
		return searchtext;
	}
	public WebElement getSearchfield() {
		selectbyvalue(searchfield, "lastname");
		return searchfield;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
}
