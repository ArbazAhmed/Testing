package New;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PostGoodsMoment {
	static WebDriver d;
@BeforeMethod
	
	public void url () throws IOException{
		
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c5248056\\Desktop\\New folder\\chromedriver.exe");
		d = new ChromeDriver();
	    d.manage().window().maximize();
	    
	    
		
	}
	
	
	
  @Test
  public void f() throws IOException {
	  
	  
	    File src = new File("C:\\Users\\c5248056\\Desktop\\Excell.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet1 = wb.getSheet("Sheet");
		String User = Sheet1.getRow(1).getCell(0).getStringCellValue();
		String Password = Sheet1.getRow(1).getCell(1).getStringCellValue();
		String UserField = Sheet1.getRow(3).getCell(1).getStringCellValue();
		String PswField = Sheet1.getRow(4).getCell(1).getStringCellValue();
		String button = Sheet1.getRow(5).getCell(1).getStringCellValue();
		String Plant = Sheet1.getRow(6).getCell(1).getStringCellValue();
		String Where = Sheet1.getRow(7).getCell(1).getStringCellValue();
		String MigoTrn = Sheet1.getRow(8).getCell(1).getStringCellValue();
		String StrLoc = Sheet1.getRow(9).getCell(1).getStringCellValue();
		String OtherTab = Sheet1.getRow(10).getCell(1).getStringCellValue();
		String MigoTransaction = Sheet1.getRow(11).getCell(1).getStringCellValue();
		String GoodsIssue = Sheet1.getRow(12).getCell(1).getStringCellValue();
		
		  //URL Passing
		  d.get("https://c5248056:Lenovo_T460@oc7-715.wdf.sap.corp/ui#Material-postGoodsMovementInWebGUI?sap-ui-tech-hint=GUI");
		  //User & Password
		  d.findElement(By.xpath(UserField)).sendKeys(User);
		  d.findElement(By.xpath(PswField)).sendKeys(Password);
		  d.findElement(By.xpath(button)).click();
		
		  // IFrame Switch
		  d.switchTo().frame("application-Material-postGoodsMovementInWebGUI");
		  d.switchTo().frame("ITSFRAME1");
		  System.out.println("frame Switched");
		  System.out.println("Wait");
		  d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  System.out.println("After Wait");
		  
		  //Select MIGO transaction
		  d.findElement(By.xpath(MigoTransaction)).click();
		  d.findElement(By.xpath(GoodsIssue)).click();
		  System.out.println("Migo Dropdown");
		  
		
		   d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  
		  //Select Value from Dropdown
		  d.findElement(By.xpath(MigoTrn)).click();
		  d.findElement(By.xpath(OtherTab)).click();
		  
		  d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		  //Click on Where Tab
		  d.findElement(By.xpath(Where)).click();
		  
		  d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  
		  
		  //Enter Value in Plant
		  d.findElement(By.xpath(Plant)).sendKeys("1010");
		  
		  d.findElement(By.xpath(StrLoc)).sendKeys("101R");
		 
		 
	     d.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
