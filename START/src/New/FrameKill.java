package New;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameKill {
  @Test
  public void f() {
	  
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c5248056\\Desktop\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.get("http://toolsqa.com/automation-practice-switch-windows/");
	    System.out.println(d.getWindowHandle());
	    d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	/*    d.findElement(By.xpath("//button[text()='New Browser Window']")).click();
	    Set handal = d.getWindowHandles();
	    System.out.println(handal);
	    for (String handle1 : d.getWindowHandles()) {
	    	 
        	System.out.println(handle1);

        	d.switchTo().window(handle1);

        	}
        	
	     
	    System.out.println("window switch");
	    
	    d.manage().window().maximize();
	    */
	    
	    d.findElement(By.xpath("//button[text()='New Message Window']")).click();
	    
	    Set handal = d.getWindowHandles();
	    System.out.println(handal);
	    
	   
	    
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
