package New;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class first {

	
	
	@Test
      void test (){
		
		System.out.println("this is first Test");	
		
	}
	
	
	@Test
      void testing (){
		
		System.out.println("this is Second Test");	
		
	}
	
	
	@BeforeTest 
	
	void before (){
		
		System.out.println("before test ");
		
	}
	
	@AfterTest 
	void after (){
		
		System.out.println("After Test");
		
	}
	@BeforeMethod
	void method (){
		
		System.out.println("Before Method");
		
	}
	
	@BeforeClass
	void Class(){
		
		System.out.println("Before Class");
		
	}
	@AfterMethod
	void aftermethod (){
		
		System.out.println("After Method");
	}
	@AfterClass
	void afterclass (){
		
		System.out.println("after class");
	}
	
	@BeforeGroups
	void beforgroup(){
		System.out.println("Before Group");
	}
	
	@AfterGroups
	void aftergroup(){
		System.out.println("after group");
	}
	
	@BeforeSuite
	void beforesuit (){
		
		System.out.println("before suit");
	}
	
	@AfterSuite
	void aftersuit (){
		
		System.out.println("after suit");
	}
}