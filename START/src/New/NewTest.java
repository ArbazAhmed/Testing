package New;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class NewTest {
	
	
	
	@Test
  public void f() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c5248056\\Desktop\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		String URL = "https://flpsandbox-wbbf69898.dispatcher.int.sap.hana.ondemand.com/sites?siteId=eacc49de-0429-4dd7-b7ec-d28e2671a6d0#StandardProjectOC4-Display&/StepsSet/42F2E9AFC5FF1ED69D9B627D231B497E/00002";	
		d.get(URL);
        
	    d.manage().window().maximize();
	    WebDriverWait wait = new WebDriverWait(d,60);
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='EditVariant']")));
	    
	    
		
		
		
		
		
		
		
  }
  
	
	
	
	
	
	

}
