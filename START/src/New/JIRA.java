package New;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JIRA {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c5248056\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("http://www.amazon.in/gp/goldbox/ref=nav_cs_gb");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		List<WebElement> prod =d.findElements(By.xpath("//div[@class='a-row layer backGround']"));
		
		int value = prod.size();
		System.out.println(value);
		
		
		
		
		

	}

}
