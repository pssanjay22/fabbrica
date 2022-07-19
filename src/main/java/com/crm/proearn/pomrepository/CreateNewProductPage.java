package com.crm.proearn.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProductPage {

	public CreateNewProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="productname")
	private WebElement productname;
	@FindBy(name="button")
	private WebElement save;
	
	public WebElement getProductname() {
		return productname;
	}
	public WebElement getSave() {
		return save;
	}
	
}
