package New;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Carb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\c5248056\\Desktop\\New folder\\geckodriver.exe");
//FirefoxProfile fp = new FirefoxProfile();
//fp.setAssumeUntrustedCertificateIssuer(false);
		
		WebDriver d = new FirefoxDriver();
		//d.get("https://sapjira.wdf.sap.corp/login.jsp?os_destination=%2Fsecure%2FManageRapidViews.jspa");
		d.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		d.manage().window().maximize();

	}

}
