package New;


import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class amazonDealOfDay {

	
	public static void main(String[] args) throws ParseException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c5248056\\Desktop\\New folder\\chromedriver.exe");
		
		//WebDriver d = new ChromeDriver();
		
		// URL 
		System.out.println("Enter URL");
		Scanner url = new Scanner(System.in);
		String URL;
		URL = url.next();
		
		
		
		
		WebDriver d = new ChromeDriver();
		d.get(URL);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().window().maximize();
		//Name of Product
		String Product= d.findElement(By.id("productTitle")).getText();
		System.out.println(Product);
		
		//Rating of Product
		//String Rating = d.findElement(By.className("a-icon-alt")).getText();
		//System.out.println(Rating);
		
		
		// Actual price of Product
		String lp = d.findElement(By.className("a-text-strike")).getText().trim();
		System.out.println(lp+"₹ is Listed price");
		
		//Sales price 
		//WebElement CostPrice = d.findElement(By.id("priceblock_ourprice"));
		WebElement CostPrice= d.findElement(By.xpath("//span[@id='priceblock_saleprice' or @id='priceblock_ourprice']"));
		WebElement DealPrice = d.findElement(By.xpath("//span[@id='priceblock_dealprice']"));
		
		
		String cp = CostPrice.getText().trim().replaceAll(",", "");
		//cp =cp.replaceAll(",", "");
		System.out.println(cp+"₹ is price in product use to sell");
		//String value1 = cp.trim();
		
		  /*NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
		  Number number = format.parse("1,234");
		  double db = number.doubleValue();
		*/
		
		//System.out.println("db : "+db);
		double acp = Double.parseDouble(cp);	
		
		//Deal price of product
		String dp = DealPrice.getText().trim();
		dp =dp.replaceAll (",", "");
		System.out.println(dp+"₹ is deal price");
		//String value2 = dp.trim();//dp.replaceAll("[^0-9]", "");
		double adp = Double.parseDouble(dp);
		double actual = acp-adp;
		
		// Actual % of profit 
		double Precent = ((actual*100)/acp);
		DecimalFormat df =new DecimalFormat("#.##");
		System.out.println(df.format(Precent)+"% is actuall percent of profit");
		
		System.out.println(actual+"₹ is actuall difference in Money");
		
		
		//Screenshot
		File scr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("C:\\Users\\c5248056\\Desktop\\Screenshot\\Screenshot.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		d.quit();
		
		
		
		

	}

}
