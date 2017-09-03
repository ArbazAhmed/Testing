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
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest {
	
	
	
	
	
	// System.setProperty("webdriver.chrome.driver","C:\\Users\\c5248056\\Desktop\\New folder\\chromedriver.exe");
	static WebDriver d;
	
	
	
	@BeforeMethod
	
	public void url () throws IOException{
		
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c5248056\\Desktop\\New folder\\chromedriver.exe");
		d = new ChromeDriver();
	    d.manage().window().maximize();
	    
	    
		
	}
	
	
	
  @Test  (priority = 0)
  public void f() throws IOException {
	  File src = new File("C:\\Users\\c5248056\\Desktop\\Excell.xlsx");
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet	Sheet = wb.getSheet("Sheet1");
	  String User = Sheet.getRow(1).getCell(0).getStringCellValue();
	  String Password = Sheet.getRow(1).getCell(1).getStringCellValue();
	  System.out.println(User);
	  
	System.out.println("Test1");
	  d.get("https://ccf-390.wdf.sap.corp/ui#CloudSolution-manage?sap-ushell-reload=X");
	  d.findElement(By.xpath("//div[@id='USERNAME_FIELD']/input")).sendKeys("S4hgen");
	  d.findElement(By.xpath("//div[@id='PASSWORD_FIELD']/input")).sendKeys("Welcome1!");
	  d.findElement(By.xpath("//button[@id='LOGIN_LINK']")).click();
	  System.out.println("End Test 1 ");
  }
  
  @Test (priority = 1)
  public void V() {
	  
		System.out.println("Test2");
	  d.get("https://ccf-390.wdf.sap.corp/ui#CloudSolution-manage?sap-ushell-reload=X");
	  d.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	  d.findElement(By.xpath("//div[@id='USERNAME_FIELD']/input")).sendKeys("S4hgen");
	  d.findElement(By.xpath("//div[@id='PASSWORD_FIELD']/input")).sendKeys("Welcome1!");
	  d.findElement(By.xpath("//button[@id='LOGIN_LINK']")).click();
	  System.out.println("End Test 2 ");
  
	  
  }
  
  @Test (priority = 2)
  public void X() {
	  
		System.out.println("Test3");
	  d.get("https://ccf-390.wdf.sap.corp/ui#CloudSolution-manage?sap-ushell-reload=X");
	  d.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	  d.findElement(By.xpath("//div[@id='USERNAME_FIELD']/input")).sendKeys("S4hgen");
	  d.findElement(By.xpath("//div[@id='PASSWORD_FIELD']/input")).sendKeys("Welcome1!");
	  d.findElement(By.xpath("//button[@id='LOGIN_LINK']")).click();	
	  System.out.println("End Test 3 ");
  
	  
  }
  
  @AfterMethod
  public void quit(){
	  System.out.println("AFTER Method");
	  d.quit();
	  
	  
  }
}
