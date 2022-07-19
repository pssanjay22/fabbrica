
package com.crm.proearn.campaignsTest;

import org.testng.annotations.Test;

import com.crm.proearn.genericutility.BaseClass;
import com.crm.proearn.genericutility.ExcelUtility;
import com.crm.proearn.pomrepository.CampaignPage;
import com.crm.proearn.pomrepository.CreateNewCampaignPage;
import com.crm.proearn.pomrepository.CreateNewProductPage;
import com.crm.proearn.pomrepository.CreateProductInformationPage;
import com.crm.proearn.pomrepository.CreateProductPage;
import com.crm.proearn.pomrepository.HomePage;

public class CreateCampaignWithProductTest extends BaseClass {

	@Test
	public void CreateCampaignWithProductTest() throws Throwable {
		//public static void main(String[] args) throws Throwable {
		//FileUtility fLib=new FileUtility();
		ExcelUtility eLib=new ExcelUtility();
		//WebDriverUtility wLib=new WebDriverUtility();

		//FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
		//Properties p=new Properties();
		//p.load(fis);
		//String url = fLib.getPropertyKeyValue("url");
		//String un = fLib.getPropertyKeyValue("un");
		//String pwd = fLib.getPropertyKeyValue("pwd");

		//WebDriver driver=new ChromeDriver();
		//wLib.waitForElementInDOM(driver);
		//LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);
		CampaignPage cp=new CampaignPage(driver);
		CreateNewCampaignPage cnp=new CreateNewCampaignPage(driver);
		CreateProductPage cpp=new CreateProductPage(driver);
		CreateNewProductPage cnpp=new CreateNewProductPage(driver);
		CreateProductInformationPage cpip=new CreateProductInformationPage(driver);

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//lp.loginToApp(url, un, pwd);

		//driver.get(url);
		//driver.findElement(By.name("user_name")).sendKeys(un);
		//driver.findElement(By.name("user_password")).sendKeys(pwd);
		//driver.findElement(By.id("submitButton")).click();

		hp.getProductmodule().click();
		cpp.getCreateproductimg().click();

		//driver.findElement(By.xpath("(//a[text()='Products'])[1]")).click();
		//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();

		String pname = eLib.getDataFromExcel("Sheet3", 1, 0);
		String campaignname = eLib.getDataFromExcel("Sheet3", 1, 1);

		//FileInputStream fis1=new FileInputStream("./testdata/Exceldata.xlsx");
		//Workbook wb=WorkbookFactory.create(fis1);
		//String pname = wb.getSheet("sheet3").getRow(1).getCell(0).getStringCellValue();
		//String campaignname = wb.getSheet("Sheet3").getRow(1).getCell(1).getStringCellValue();

		cnpp.getProductname().sendKeys(pname);
		cnpp.getSave().click();

		//driver.findElement(By.name("productname")).sendKeys(pname);
		//driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();

		cpip.getMoreicon().click();
		cpip.getCampaignmodule().click();

		//driver.findElement(By.xpath("//a[text()='More']")).click();

		//Actions a=new Actions(driver);
		//a.moveToElement(more).perform();

		//WebElement more = driver.findElement(By.id("more"));
		//wLib.mouseOverOnElement(driver, more);
		//driver.findElement(By.xpath("(//a[text()='Campaigns'])[1]")).click();

		cp.getCreatenewcamp().click();
		cnp.getCampaignname().sendKeys(campaignname);
		cnp.getClickproductimg().click();

		//driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		//driver.findElement(By.name("campaignname")).sendKeys(campaignname);
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();

		String PartialWindowTitle = eLib.getDataFromExcel("Sheet3", 1, 2);

		//String PartialWindowTitle = wb.getSheet("Sheet3").getRow(1).getCell(2).getStringCellValue();

		//wLib.swithToWindow(driver, PartialWindowTitle);

		/*Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String wid = it.next();
			driver.switchTo().window(wid);
			String currentwindowtitle = driver.getTitle();
			if(currentwindowtitle.contains(PartialWindowTitle))
			{
				break;
			}
		}*/

		cnp.getSearchtxt(PartialWindowTitle).sendKeys(pname);
		cnp.searchselect();

		//driver.findElement(By.id("search_txt")).sendKeys(pname);
		//driver.findElement(By.name("search")).click();
		//driver.findElement(By.xpath("(//a[@href='javascript:window.close();'])[1]")).click();

		String PartialWindowTitle1 = eLib.getDataFromExcel("Sheet3", 1, 3);
		cnp.save(PartialWindowTitle1);
		//hp.signout();

		//String parentWindow = wb.getSheet("Sheet3").getRow(1).getCell(3).getStringCellValue();

		//wLib.swithToWindow(driver, PartialWindowTitle);

		/*Set<String> set1 = driver.getWindowHandles();
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext())
		{
			String wid1 = it1.next();
			driver.switchTo().window(wid1);
			String currentwindowtitle1 = driver.getTitle();
			if(currentwindowtitle1.contains(parentWindow));
			{
				break;
			}
		}*/

		//driver.findElement(By.name("button")).click();
		//Actions a1=new Actions(driver);
		//WebElement admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		//a1.moveToElement(admin).perform();
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

		//driver.close();
	}

}
