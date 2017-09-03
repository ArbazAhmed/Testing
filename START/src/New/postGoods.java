package New;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.configReader;

public class postGoods {
	
	static WebDriver d;
@BeforeMethod
	
	public void url () throws IOException{
	
	    configReader reader = new configReader();
		
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver",reader.getChromePath());
		d = new ChromeDriver();
	    d.manage().window().maximize();
		
	}
	
  @Test
  public void f() throws IOException {
	  
	  configReader reader = new configReader();
	  
	    File src = new File(reader.getExcelPath());
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
		String MigoTragn = Sheet1.getRow(11).getCell(1).getStringCellValue();
		String GoodsIssue = Sheet1.getRow(12).getCell(1).getStringCellValue();
		String DeliveryNote = Sheet1.getRow(13).getCell(1).getStringCellValue();
		String DocHeader = Sheet1.getRow(14).getCell(1).getStringCellValue();
		  //URL Passing
		  d.get("https://c5248056:Lenovo_T460@hc7-715.wdf.sap.corp/ui#Material-postGoodsMovementInWebGUI?sap-ui-tech-hint=GUI");
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
	     
		  d.findElement(By.xpath(MigoTragn)).click();
		  System.out.println("Migo Transaction");
		  d.findElement(By.xpath(GoodsIssue)).click();
	      
		  d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  
		  d.findElement(By.xpath(DeliveryNote)).sendKeys("1010");
		  d.findElement(By.xpath(DocHeader)).sendKeys("12345");
		 
		  d.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	  
	      d.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
