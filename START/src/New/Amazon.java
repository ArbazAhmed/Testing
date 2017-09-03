package New;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
  
	
	
	
	
	@Test
  
  public void f() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c5248056\\Desktop\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
		
		d.get("https://oc7-715.wdf.sap.corp/ui#SupplierEvalTemplate-manage?sap-ui-tech-hint=UI5&/?sap-iapp-state=ASSV847XHIDNO5YIDWUAP9YFDNX3J0RTSEBI6LTU ");
	    
		d.findElement(By.xpath("//div[@id='USERNAME_FIELD']/input")).sendKeys("S4hgen");
		d.findElement(By.xpath("//div[@id='PASSWORD_FIELD']/input")).sendKeys("Welcome1");
		d.findElement(By.xpath("//button[@id='LOGIN_LINK']")).click();
		
		d.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//a[text()='template_HFC3 (11)']")).click();
		
		ArrayList<String> tabs = new ArrayList<String> (d.getWindowHandles());
		 System.out.println("tabs : "+tabs.size());
		//Switch to new window
		d.switchTo().window(tabs.get(1));
		
		
		d.findElement(By.xpath("//span[text()='Start Group-Based Evaluation']")).click();
		
		
		d.findElement(By.xpath("//tr[td[label[span[text()='Evaluation Request Name']]]]//following-sibling::td//input")).sendKeys("test");
	    
	    System.out.println();
	    
	    
	    
	  
		
	  
	  
  }
}
