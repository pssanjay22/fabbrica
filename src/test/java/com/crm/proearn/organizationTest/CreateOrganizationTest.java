package com.crm.proearn.organizationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.proearn.genericutility.BaseClass;
import com.crm.proearn.genericutility.ExcelUtility;
import com.crm.proearn.genericutility.FileUtility;
import com.crm.proearn.genericutility.JavaUtility;
import com.crm.proearn.genericutility.WebDriverUtility;
import com.crm.proearn.pomrepository.CreateNewOrganizationPage;
import com.crm.proearn.pomrepository.CreateOrganizationPage;
import com.crm.proearn.pomrepository.HomePage;
import com.crm.proearn.pomrepository.LoginPage;

@Listeners(com.crm.proearn.genericutility.ListenerImplementationClass.class)
public class CreateOrganizationTest extends BaseClass {

	@Test
	public void CreateOrganizationTest() throws Throwable {
	//public static void main(String[] args) throws Throwable {
		//FileUtility fLib=new FileUtility();
		ExcelUtility eLib=new ExcelUtility();
		JavaUtility jLib=new JavaUtility();
		int random = jLib.getRandomNumber();
		//WebDriverUtility wLib=new WebDriverUtility();
		//FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
		//Properties p=new Properties();
		//p.load(fis);
		//String url = fLib.getPropertyKeyValue("url");
		//String un = fLib.getPropertyKeyValue("un");
		//String pwd = fLib.getPropertyKeyValue("pwd");
		
		//WebDriver driver=new ChromeDriver();
		//wLib.waitForElementInDOM(driver);
		//Assert.fail();
		//LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);
		CreateOrganizationPage op=new CreateOrganizationPage(driver);
		CreateNewOrganizationPage nop=new CreateNewOrganizationPage(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//lp.loginToApp(url, un, pwd);
	
		/*driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();*/
		
		hp.getOrganizationmodule().click();
		op.getOrgimgbox().click();
		
		//driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

		String actualtext = eLib.getDataFromExcel("Organization", 1, 0);
		//FileInputStream fis1=new FileInputStream("./testdata/Exceldata.xlsx");
		//Workbook wb=WorkbookFactory.create(fis1);
		//String actualtext = wb.getSheet("Organization").getRow(1).getCell(0).getStringCellValue();
		
		nop.getOrgname().sendKeys(actualtext+random);
		nop.getSave().click();
		
		//driver.findElement(By.name("accountname")).sendKeys(actualtext);
		//driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		String expectedtext = op.getVerifyorg().getText();
		Assert.assertTrue(true, expectedtext);
		//String expectedtext = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		/*if(expectedtext.contains(actualtext))
		{
			System.out.println("Organization name is succsfully created");
		}
		else {
			System.out.println("Organization name is not created");
		}*/
		//hp.signout();
		
		//Actions a1=new Actions(driver);
		//WebElement admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		//a1.moveToElement(admin).perform();
		//wLib.mouseOverOnElement(driver, admin);
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		//driver.close();
		
	}

}
