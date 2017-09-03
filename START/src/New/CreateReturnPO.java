package New;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.configReader;

public class CreateReturnPO {
	
	static WebDriver d;
	@BeforeTest
	
	void setup(){
        configReader reader = new configReader();
		
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver",reader.getChromePath());
		d = new ChromeDriver();
	    d.manage().window().maximize();
		
	}
	
	
	
	
  @Test
  public void f() throws Exception {
	  
	  File src = new File("C:\\Users\\c5248056\\Desktop\\Excell.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet1 = wb.getSheet("PurchaseOrder-create");
		int now = Sheet1.getLastRowNum();	
		String User = Sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(User);
		String Password = Sheet1.getRow(2).getCell(1).getStringCellValue();
		String UserField = Sheet1.getRow(3).getCell(1).getStringCellValue();
		String PswField = Sheet1.getRow(4).getCell(1).getStringCellValue();
		String button = Sheet1.getRow(5).getCell(1).getStringCellValue();
		String Supplier = Sheet1.getRow(6).getCell(1).getStringCellValue();	 
		String PurOrg = Sheet1.getRow(7).getCell(1).getStringCellValue();
		String PurGroup = Sheet1.getRow(8).getCell(1).getStringCellValue();
		String CompanyCode = Sheet1.getRow(9).getCell(1).getStringCellValue();
		String Material = Sheet1.getRow(10).getCell(1).getStringCellValue();
		String POQuantity = Sheet1.getRow(12).getCell(1).getStringCellValue();
		String NetPrice = Sheet1.getRow(13).getCell(1).getStringCellValue();
		String SaveButton = Sheet1.getRow(11).getCell(1).getStringCellValue();
		
		
		
		
		
		
		
		  //URL 
		  d.get("https://oc7-715.wdf.sap.corp/ui#PurchaseOrder-create?uitype=advanced");
		  //User & Password
		  d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  d.findElement(By.xpath(UserField)).sendKeys(User);
		  d.findElement(By.xpath(PswField)).sendKeys(Password);
		  //Click on Login Button
		   d.findElement(By.xpath(button)).click();
		   
		   //Wait for Page load 
	        d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
	     	// IFrame Switch
			d.switchTo().frame("application-PurchaseOrder-create");
		    d.switchTo().frame("ITSFRAME1");
		    
		    System.out.println("frame switch");
		    
		   
		    //Enter Supplier value and click enter   
		    d.findElement(By.xpath(Supplier)).sendKeys("10300006");
		    d.findElement(By.xpath(Supplier)).sendKeys(Keys.RETURN);
		    
		    
		   //Enter Values  
		   d.findElement(By.xpath(PurOrg)).sendKeys("1010"); 
		   d.findElement(By.xpath(PurGroup)).sendKeys("001");
		   d.findElement(By.xpath(CompanyCode)).sendKeys("1010");
		   d.findElement(By.xpath(CompanyCode)).sendKeys(Keys.RETURN);
		    
		   // Wait    
		   d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   //Enter Value
		  
		//   d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   d.findElement(By.xpath(Material)).click();
		   d.findElement(By.xpath(Material)).sendKeys("tg12");
		   d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	       d.findElement(By.xpath("//td[text()='TRAD.GOOD 12,REORDER POINT,REG.TRAD.']")).click();
	//	   d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   d.findElement(By.xpath(POQuantity)).click(); 
		  
			d.findElement(By.xpath(POQuantity)).sendKeys("1");
			//d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		   d.findElement(By.xpath(POQuantity)).sendKeys(Keys.RETURN);
		//   d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   d.findElement(By.xpath(NetPrice)).click();
		   d.findElement(By.xpath(NetPrice)).sendKeys("13.98");
		   d.findElement(By.xpath(Material)).click();
		   
		   
		   d.findElement(By.xpath(Material)).sendKeys(Keys.RETURN);
		   
		   //Click on save button
		    
		   d.findElement(By.xpath(SaveButton)).click();
		
		
		   
		
		
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
