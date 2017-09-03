package New;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class c4c {

	public static void main(String[] args) {
		

DesiredCapabilities capabilities = DesiredCapabilities.chrome();
capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
System.setProperty("webdriver.gecko.driver","C:\\Users\\c5248056\\Desktop\\New folder\\geckodriver.exe");
//System.setProperty("webdriver.chrome.driver", "/home/chinna/lib/chromedriver");// Your chromedriver path.
//capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
ProfilesIni prof = new ProfilesIni();				



		WebDriver d = new FirefoxDriver(capabilities);
		d.get("https://my310284.vlab.sapbydesign.com");
		d.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		d.manage().window().maximize();
		FirefoxProfile ffProfile= prof.getProfile ("myProfile");
		ffProfile.setAcceptUntrustedCertificates(true);
		
		d.findElement(By.id("__control0-user")).sendKeys("PROJECTADMIN ");
		d.findElement(By.id("__control0-pass")).sendKeys("Welcome2");
		d.findElement(By.id("__control0-logonBtn")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//https://my310284.vlab.sapbydesign.com

	}

}
