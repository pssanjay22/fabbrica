package com.crm.proearn.campaignsTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.proearn.genericutility.BaseClass;
import com.crm.proearn.genericutility.ExcelUtility;
import com.crm.proearn.pomrepository.CampaignPage;
import com.crm.proearn.pomrepository.CreateNewCampaignPage;
import com.crm.proearn.pomrepository.CreateNewProductPage;
import com.crm.proearn.pomrepository.CreateProductInformationPage;
import com.crm.proearn.pomrepository.CreateProductPage;
import com.crm.proearn.pomrepository.HomePage;

@Listeners(com.crm.proearn.genericutility.ListenerImplementationClass.class)
public class CampaignTest extends BaseClass {
	@Test(groups = "SmokeTest")
	public void CreateCampaignTest() throws Throwable
	{
		ExcelUtility eLib=new ExcelUtility();
		HomePage hp=new HomePage(driver);
		CampaignPage camp=new CampaignPage(driver);
		CreateNewCampaignPage campn=new CreateNewCampaignPage(driver);
		
		hp.campaignmodule();
//Assert.fail();
		camp.getCreatenewcamp().click();

		String actualdata =eLib.getDataFromExcel("Campaign", 1, 2);
		
		campn.getCampaignname().sendKeys(actualdata);
		
		campn.getSave().click();

		String execepteddata = camp.getVerifytext().getText();
		Assert.assertTrue(execepteddata.contains(actualdata));

	}

	@Test(groups = "RegressionTest")
	public void CreateCampaignWithProductTest() throws Throwable {
		
		ExcelUtility eLib=new ExcelUtility();
		HomePage hp=new HomePage(driver);
		CampaignPage cp=new CampaignPage(driver);
		CreateNewCampaignPage cnp=new CreateNewCampaignPage(driver);
		CreateProductPage cpp=new CreateProductPage(driver);
		CreateNewProductPage cnpp=new CreateNewProductPage(driver);
		CreateProductInformationPage cpip=new CreateProductInformationPage(driver);

		hp.getProductmodule().click();
		cpp.getCreateproductimg().click();

		String pname = eLib.getDataFromExcel("Sheet3", 1, 0);
		String campaignname = eLib.getDataFromExcel("Sheet3", 1, 1);
//Assert.fail();
		cnpp.getProductname().sendKeys(pname);
		cnpp.getSave().click();

		cpip.getMoreicon().click();
		cpip.getCampaignmodule().click();

		cp.getCreatenewcamp().click();
		cnp.getCampaignname().sendKeys(campaignname);
		cnp.getClickproductimg().click();

		String PartialWindowTitle = eLib.getDataFromExcel("Sheet3", 1, 2);

		cnp.getSearchtxt(PartialWindowTitle).sendKeys(pname);
		cnp.searchselect();

		String PartialWindowTitle1 = eLib.getDataFromExcel("Sheet3", 1, 3);
		cnp.save(PartialWindowTitle1);

	}
}
