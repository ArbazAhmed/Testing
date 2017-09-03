package New;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anil {

       public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\c5248056\\Desktop\\New folder\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://ccf-390.wdf.sap.corp/ui#Recipe-display?Plant=1010&Recipe=PLMPI_OUTPT1%252F001%252F001&RecipeAlternativeNumber=001&RecipeDescription=Matt%2520Blue%2520wrap&RecipePrimaryOutput=PLMPI_OUTPT1&RecipeStatus=310&RecipeType=SITE&RecipeUUID=8cdcd400-77b8-1ed7-90a0-32e131f78378&RecipeVersionNumber=001&__metadata=%257B%2522id%2522%253A%2522https%253A%252F%252Fccf-390.wdf.sap.corp%253A443%252Fsap%252Fopu%252Fodata%252Fsap%252FPLMI_RECIPE_MANAGE%252FC_RecipeCurrentObjPg(guid'8cdcd400-77b8-1ed7-90a0-32e131f78378')%2522%252C%2522uri%2522%253A%2522https%253A%252F%252Fccf-390.wdf.sap.corp%253A443%252Fsap%252Fopu%252Fodata%252Fsap%252FPLMI_RECIPE_MANAGE%252FC_RecipeCurrentObjPg(guid'8cdcd400-77b8-1ed7-90a0-32e131f78378')%2522%252C%2522type%2522%253A%2522PLMI_RECIPE_MANAGE.C_RecipeCurrentObjPgType%2522%257D&sap-xapp-state=ASNNBXD7RBR1YEZSJ3TNAX599X59LC7B2K1OU74Z&to_PlantVH=%257B%2522__ref%2522%253A%2522I_Plant('1010')%2522%257D&to_RecipeStatus=%257B%2522__ref%2522%253A%2522I_RecipeStatus('310')%2522%257D&to_RecipeTypeVH=%257B%2522__ref%2522%253A%2522I_RecipeTypeValueHelp('SITE')%2522%257D");
		d.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.findElement(By.xpath("//div[@id='USERNAME_FIELD']/input")).sendKeys("S4hgen");
		d.findElement(By.xpath("//div[@id='PASSWORD_FIELD']/input")).sendKeys("Welcome1");
		d.findElement(By.xpath("//button[@id='LOGIN_LINK']")).click();
		d.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement frame = d.findElement(By.id("application-Recipe-display"));
		
		System.out.println(frame.getAttribute("id"));
		System.out.println("Count : "+d.findElements(By.tagName("iframe")).size());
		d.switchTo().frame(frame);
		System.out.println("Count1 : "+d.findElements(By.tagName("iframe")).size());
		//d.switchTo().frame(1);
		d.switchTo().frame(d.findElements(By.tagName("iframe")).get(0));
		System.out.println("Count2 : "+d.findElements(By.tagName("iframe")).size());
		//d.switchTo().frame(0);
		
		//System.out.println("Found : "+d.findElements(By.xpath("//span[@id='WD28-r']//span")).size());
		//d.findElement(By.xpath("//td[@id='WD20-menuindicator']/div/span[8]")).click();
		//
		//d.findElement(By.xpath("//span[@id='WD28-r']//span")).click();
		d.findElement(By.xpath("//*[@id='WD28-MnuIco']")).click();
		System.out.println("Clicked : You can also");
		d.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		//d.findElement(By.xpath("//*[contains(text(),'Synchronize Recipe to BOM')]")).click();
		
		System.out.println("Displayed "+d.findElement(By.xpath("//*[@class='urNoUserSelect lsLCDropShadow']/div/div[@id='WD2E-cnt']//tr[1]")).isDisplayed());
	//	System.out.println("Disp : "+d.findElement(By.xpath("//span[contains(text(),'Display Multiple Recipes')]/../../following-sibling::tr[6]//td[3]")).isDisplayed());
	//	d.findElement(By.xpath("(//*[@class='urNoUserSelect lsLCDropShadow'])[2]//tr[7]/td[3]")).click();
//		d.findElement(By.xpath("//span[contains(text(),'Display Multiple Recipes')]/../../following-sibling::tr[6]//td[3]")).click();
		//d.findElement(By.xpath("//span[contains(text(),'Display Multiple Recipes')]/../../following-sibling::tr[6]//td[3]//*[contains(text(),'Sync')]")).click();
		//
		d.quit();
	/*	System.out.println("Clicked");
		//d.findElement(By.xpath("//td[@id='urMnuTxt']/span")).click();
		String old = d.getWindowHandle();
		System.out.println(old);
		String hand = d.getWindowHandle();
		System.out.println(hand);
	
		// Store the current window handle
		String winHandleBefore = d.getWindowHandle();
          System.out.println(winHandleBefore);
		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : d.getWindowHandles()){
		    d.switchTo().window(winHandle);
		}
		String winHandleAfter = d.getWindowHandle();
		System.out.println(winHandleAfter);
		// Perform the actions on new window

		
		
		//d.switchTo().window(handel);
		System.out.println("Frame Switched");
		String cu = d.getWindowHandle();
		System.out.println(cu);
		
		d.findElement(By.xpath("//*[@id='WD54-MnuIco']")).click();
		
		d.quit();
		
		*/
		
		

	}

}
