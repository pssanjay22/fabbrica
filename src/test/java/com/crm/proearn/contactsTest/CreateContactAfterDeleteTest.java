package com.crm.proearn.contactsTest;

import org.testng.annotations.Test;

import com.crm.proearn.genericutility.BaseClass;
import com.crm.proearn.genericutility.ExcelUtility;
import com.crm.proearn.pomrepository.ContactInformationPage;
import com.crm.proearn.pomrepository.ContactsPage;
import com.crm.proearn.pomrepository.CreateNewContactPage;
import com.crm.proearn.pomrepository.HomePage;

public class CreateContactAfterDeleteTest extends BaseClass{

	@Test
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

			if(expectedresult.contains(lastname))
			{
				System.out.println("contact is not deleted");
			}
			else {

				System.out.println("contact is succesfully deleted");
			}
	}
}


//public void CreateAndDeleteContactTest() throws Throwable {
	//public static void main(String[] args) throws Throwable {
	//FileUtility fLib=new FileUtility();
	//ExcelUtility eLib=new ExcelUtility();
	//WebDriverUtility wLib=new WebDriverUtility();

	//FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
	//Properties p=new Properties();
	//p.load(fis);
	//String url = fLib.getPropertyKeyValue("url");
	//String un = fLib.getPropertyKeyValue("un");
	//String pwd = fLib.getPropertyKeyValue("pwd");

	//WebDriver driver=new ChromeDriver();
	//LoginPage lp=new LoginPage(driver);
	//HomePage hp=new HomePage(driver);
	//ContactsPage cp=new ContactsPage(driver);
	//CreateNewContactPage cnp=new CreateNewContactPage(driver);
	//ContactInformationPage cip=new ContactInformationPage(driver);

	//wLib.waitForElementInDOM(driver);

	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//lp.loginToApp(url, un, pwd);

	/*driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();*/

	//hp.getContactmodule().click();
	//cp.getCreatecontactimg().click();

	//driver.findElement(By.xpath("(//a[contains(text(),'Contacts')])[1]")).click();
	//driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

	//String lastname = eLib.getDataFromExcel("Campaign", 2, 1);

	//FileInputStream fis1=new FileInputStream("./testdata/Excelname.xlsx");
	//Workbook wb=WorkbookFactory.create(fis1);
	//String lastname = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();

	//cnp.getLastname().sendKeys(lastname);
	//cnp.getSave().click();

	//driver.findElement(By.name("lastname")).sendKeys(lastname);
	//driver.findElement(By.name("button")).click();

	//cip.getDelete().click();

	//driver.findElement(By.xpath("(//input[@title='Delete [Alt+D]'])[1]")).click();

	//Alert a=driver.switchTo().alert();
	//a.accept();
	//cp.getSearchtxt().sendKeys(lastname);
	//cp.getSearchfield().click();

	//driver.findElement(By.name("search_text")).sendKeys(lastname);
	//WebElement in = driver.findElement(By.id("bas_searchfield"));

	//wLib.selectbyvalue(in, "lastname");

	//Select s=new Select(in);
	//s.selectByValue("lastname");

	//cp.getSubmit().click();

	//driver.findElement(By.name("submit")).click();

	//String expectedresult = cp.getVerifydelete().getText();

	//String expectedresult = driver.findElement(By.xpath("//span[@class='genHeaderSmall']")).getText();
	/*if(expectedresult.contains(lastname))
	{
		System.out.println("contact is not deleted");
	}
	else {

		System.out.println("contact is succesfully deleted");
	}
	//hp.signout();
	//driver.close();

	/*Actions a1=new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		a1.moveToElement(admin).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
}*/
