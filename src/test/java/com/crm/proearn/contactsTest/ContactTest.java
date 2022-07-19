package com.crm.proearn.contactsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.proearn.genericutility.BaseClass;
import com.crm.proearn.genericutility.ExcelUtility;
import com.crm.proearn.pomrepository.ContactInformationPage;
import com.crm.proearn.pomrepository.ContactsPage;
import com.crm.proearn.pomrepository.CreateNewContactPage;
import com.crm.proearn.pomrepository.HomePage;

public class ContactTest extends BaseClass{

	@Test(groups = "RegressionTest")
	public void CreateContactTest() throws Throwable {

		ExcelUtility eLib=new ExcelUtility();

		HomePage hp=new HomePage(driver);
		ContactsPage cp=new ContactsPage(driver);
		CreateNewContactPage cnp=new CreateNewContactPage(driver);

		hp.getContactmodule().click();
		cp.getCreatecontactimg().click();

		String lastname = eLib.getDataFromExcel("Campaign", 1, 1);
		cnp.getLastname().sendKeys(lastname);

		cnp.getSave().click();

		String create = cp.getVerifycontact().getText();
		Assert.assertTrue(create.contains(lastname));

	}

	@Test(groups="SmokeTest")
	public void CreateContactAndDeleteTest() throws Throwable {
		ExcelUtility eLib=new ExcelUtility();		
		HomePage hp=new HomePage(driver);
		ContactsPage cp=new ContactsPage(driver);
		CreateNewContactPage cnp=new CreateNewContactPage(driver);
		ContactInformationPage cip=new ContactInformationPage(driver);		
		hp.getContactmodule().click();
		cp.getCreatecontactimg().click();
		String lastname = eLib.getDataFromExcel("Campaign", 2, 1);
		cnp.getLastname().sendKeys(lastname);
		cnp.getSave().click();
		cip.getDelete().click();


		driver.switchTo().alert().accept();
		cp.getSearchtxt().sendKeys(lastname);
		cp.getSearchfield().click();


		cp.getSubmit().click();


		String expectedresult = cp.getVerifydelete().getText();
		Assert.assertFalse(expectedresult.contains(lastname));
		
	}
}
