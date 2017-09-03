package New;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomVarient {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\c5248056\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://ccf-390.wdf.sap.corp/ui#TestProcess-configure&/detail/ScenarioSet('645106F01B281ED78F895337538F9F0F')");
		d.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.findElement(By.xpath("//div[@id='USERNAME_FIELD']/input")).sendKeys("S4hgen");
		d.findElement(By.xpath("//div[@id='PASSWORD_FIELD']/input")).sendKeys("Welcome1");
		d.findElement(By.xpath("//button[@id='LOGIN_LINK']")).click();
		d.findElement(By.id("application-TestProcess-configure-component---scenario--searchField-I")).sendKeys("Accounting and Financial Close - Parallel Ledger (Copy)");
		d.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		d.findElement(By.id("application-TestProcess-configure-component---scenario--scenarioListTable-listUl")).click();
		List<WebElement> row = d.findElements(By.xpath("//tr[@class='sapMLIB sapMLIB-CTX sapMLIBActionable sapMLIBFocusable sapMLIBHoverable sapMLIBShowSeparator sapMLIBTypeNavigation sapMListTblRow']"));
		
		System.out.println(row.size());
		
		WebElement table = d.findElement(By.xpath("//table[@id='application-TestProcess-configure-component---step--procedureListViewTable-listUl']"));
		for(int i=1;i<=row.size();i++)
		{
			d.findElement(By.xpath("//table[@id='application-TestProcess-configure-component---step--procedureListViewTable-listUl']/tbody/tr["+i+"]/td/span")).click();
			
			
			d.findElement(By.id("application-TestProcess-configure-component---activity--editBtn-content")).click();
			d.findElement(By.xpath("(//a[text()='Edit Details'])[2]")).click();
			d.findElement(By.xpath("//input[@id='formulaInput-inner' and @type='text']")).clear();
			d.findElement(By.xpath("//input[@id='formulaInput-inner' and @type='text']")).sendKeys("$WAIT[20000]");
			d.findElement(By.id("ok-content")).click();
			d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//d.findElement(By.id("application-TestProcess-configure-component---activity--saveBtn-inner")).click();
			d.findElement(By.xpath("//*[@id='application-TestProcess-configure-component---activity--saveBtn-content']/*")).click();
			d.findElement(By.xpath("//span[@id='__page2-navButton-iconBtn']")).click();
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
