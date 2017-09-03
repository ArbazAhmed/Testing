package New;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.configReader;

public class StockChampion1 {
	
	
	static configReader reader;
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
  public void f() {
	  
       reader = new configReader();
	 
	  
	  
	  

	  //URL 
	  d.get("https://oc7-715.wdf.sap.corp/ui#MRPMaterial-analyzeStockIssues");
	  
	  //User & Password
	  d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  d.findElement(By.xpath(reader.UserField())).sendKeys(reader.getUser());
	  d.findElement(By.xpath(reader.PassField())).sendKeys(reader.getPassword());
	  //Click on Login Button
	  d.findElement(By.xpath(reader.LoginButton())).click();
	  
	   //Wait for Page load 
        d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
      // Select value from Dropdown  
        
      d.findElement(By.xpath(reader.Dropdown())).click();
      d.findElement(By.xpath(reader.TimeHorizon())).click();
      
      // Enter Material Group
      
      d.findElement(By.xpath(reader.MaterialGroup())).sendKeys("L004");
      
      // Click Enter
      
      d.findElement(By.xpath(reader.MaterialGroup())).sendKeys(Keys.RETURN);
      d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      
      // Click on table 
      
      d.findElement(By.xpath(reader.Table())).click();
      
      
      // Click on first shortage issue
      
      d.findElement(By.xpath(reader.Shortage())).click();
        
      // Get shortage value 
	 
	//  System.out.println(d.findElement(By.xpath(reader.Container())).getText());
	  
	  
	 
	  
  }
}
