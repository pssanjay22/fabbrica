package com.crm.proearn.organizationTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.proearn.genericutility.BaseClass;
import com.crm.proearn.genericutility.ExcelUtility;
import com.crm.proearn.genericutility.JavaUtility;
import com.crm.proearn.pomrepository.CreateNewOrganizationPage;
import com.crm.proearn.pomrepository.CreateOrganizationPage;
import com.crm.proearn.pomrepository.HomePage;

public class OrganizationTest extends BaseClass {

	@Test(groups = "SmokeTest")
	public void CreateOrganizationTest() throws Throwable {
		ExcelUtility eLib=new ExcelUtility();
		HomePage hp=new HomePage(driver);
		CreateOrganizationPage op=new CreateOrganizationPage(driver);
		CreateNewOrganizationPage nop=new CreateNewOrganizationPage(driver);
		JavaUtility jLib=new JavaUtility();
		int random = jLib.getRandomNumber();

		hp.getOrganizationmodule().click();
		op.getOrgimgbox().click();

		String actualtext = eLib.getDataFromExcel("Organization", 1, 0);

		nop.getOrgname().sendKeys(actualtext+random);
		nop.getSave().click();

		String expectedtext = op.getVerifyorg().getText();
		Assert.assertTrue(expectedtext.contains(actualtext));
	}
}
