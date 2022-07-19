package com.crm.proearn.campaignsTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.proearn.genericutility.BaseClass;
import com.crm.proearn.genericutility.ExcelUtility;
import com.crm.proearn.pomrepository.CampaignPage;
import com.crm.proearn.pomrepository.CreateNewCampaignPage;
import com.crm.proearn.pomrepository.CreateNewProductPage;
import com.crm.proearn.pomrepository.CreateProductInformationPage;
import com.crm.proearn.pomrepository.CreateProductPage;
import com.crm.proearn.pomrepository.HomePage;

public class CreateCampaignTest extends BaseClass {

	@Test(retryAnalyzer = com.crm.proearn.genericutility.RetryAnalyserImplementation.class)
	public void CreateCampaignTest() throws Throwable
		{
		//FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
		//FileUtility fLib=new FileUtility();
		ExcelUtility eLib=new ExcelUtility();
		//WebDriverUtility wLib=new WebDriverUtility();
		
		//Properties p=new Properties();
		//p.load(fis);
		
		//String url = fLib.getPropertyKeyValue("url");
		//String un = fLib.getPropertyKeyValue("un");
		//String pwd =fLib.getPropertyKeyValue("pwd");
		
		//WebDriver driver=new ChromeDriver();
		//LoginPage lp=new LoginPage(driver);
		
		HomePage hp=new HomePage(driver);
		CampaignPage camp=new CampaignPage(driver);
		CreateNewCampaignPage campn=new CreateNewCampaignPage(driver);
		
		//wLib.waitForElementInDOM(driver);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//lp.loginToApp(url, un, pwd);
		
		//driver.get(url);
		//driver.findElement(By.name("user_name")).sendKeys(un);
		//driver.findElement(By.name("user_password")).sendKeys(pwd);
		//driver.findElement(By.id("submitButton")).click();
		
		//Actions a=new Actions(driver);
		//WebElement click = driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]"));
		//wLib.mouseOverOnElement(driver, click);
		
		//a.moveToElement(click).perform();
		
		hp.campaignmodule();
		
		//hp.getCampaignmodule().click();
		
		//driver.findElement(By.name("Campaigns")).click();
		camp.getCreatenewcamp().click();
		
		//driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		
		//FileInputStream fis1=new FileInputStream("./testdata/Excelname.xlsx");
		//Workbook wb=WorkbookFactory.create(fis1);
		
		String actualdata =eLib.getDataFromExcel("Campaign", 1, 2);
		
		//String actualdata = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	
		campn.getCampaignname().sendKeys(actualdata);
		//driver.findElement(By.name("campaignname")).sendKeys(actualdata);
		campn.getSave().click();
		//driver.findElement(By.name("button")).click();
		
		String execepteddata = camp.getVerifytext().getText();
		
		Assert.assertTrue(execepteddata.contains(actualdata));
		
		//String execepteddata = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		
		/*if(execepteddata.contains(actualdata))
		{
			System.out.println("Campaign is succesfully created");
		}
		else {
			System.out.println("Campaign is not created");
		}*/
		
		
		//Actions a1=new Actions(driver);
		
		//WebElement admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		//wLib.mouseOverOnElement(driver, admin);
		//a1.moveToElement(admin).perform();
		
		//hp.signout();
		
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		//driver.close();
	}
}
