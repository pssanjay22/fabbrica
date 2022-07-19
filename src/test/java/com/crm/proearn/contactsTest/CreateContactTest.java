package com.crm.proearn.contactsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.proearn.genericutility.BaseClass;
import com.crm.proearn.genericutility.ExcelUtility;
import com.crm.proearn.genericutility.FileUtility;
import com.crm.proearn.genericutility.WebDriverUtility;
import com.crm.proearn.pomrepository.ContactsPage;
import com.crm.proearn.pomrepository.CreateNewContactPage;
import com.crm.proearn.pomrepository.HomePage;
import com.crm.proearn.pomrepository.LoginPage;

public class CreateContactTest extends BaseClass {

	@Test
	public void CreateContactTest() throws Throwable {
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
		ContactsPage cp=new ContactsPage(driver);
		CreateNewContactPage cnp=new CreateNewContactPage(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//lp.loginToApp(url, un, pwd);
		/*driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();*/
		hp.getContactmodule().click();
		cp.getCreatecontactimg().click();
		//driver.findElement(By.xpath("(//a[contains(text(),'Contacts')])[1]")).click();
		//driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		String lastname = eLib.getDataFromExcel("Campaign", 1, 1);
		//FileInputStream fis1=new FileInputStream("./testdata/Excelname.xlsx");
		//Workbook wb=WorkbookFactory.create(fis1);
		//String lastname = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		cnp.getLastname().sendKeys(lastname);
		
		//driver.findElement(By.name("lastname")).sendKeys(lastname);
		//Thread.sleep(2000);
		cnp.getSave().click();
		
		//driver.findElement(By.name("button")).click();
		//Thread.sleep(2000);
		String create = cp.getVerifycontact().getText();
		
		//String create = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		Assert.assertTrue(create.contains(lastname));
		
		/*if(create.contains(lastname))
		{
			System.out.println("Contact is succesfully created");
		}
		else {
			System.out.println("Contact is not created");
		}*/
		//hp.signout();
		//hp.signout();
		//Actions a=new Actions(driver);
		//WebElement admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		//a.moveToElement(admin).perform();
		//wLib.mouseOverOnElement(driver, admin);
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		//driver.close();
	}

}
