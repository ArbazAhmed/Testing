package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	
	Properties pro;
	
	public configReader(){
		
		try {
			File src = new File("./ObjectRepo/Config.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println("Exception is "+e.getMessage());
		
		
		}
		
	}
	
	
	public String getChromePath()
	{
		
		String path = pro.getProperty("ChromeDriver");
		
		return path;
		
		
	}
	
	public String getExcelPath(){
		
		String ExcelPath = pro.getProperty("ExcelPath");
		return ExcelPath;
	}
	

	public String UserField(){
		
		String UserField = pro.getProperty("UserField");
		return UserField;
	}
	
public String PassField(){
		
		String PassField = pro.getProperty("PassField");
		return PassField;
	}
	
public String LoginButton(){
	
	String LoginButton = pro.getProperty("LoginButton");
	return LoginButton;
}
		
	
public String getUser(){
		
		String user = pro.getProperty("UserName");
		return user;
		
		
	}
	
public String getPassword(){
	
	String password = pro.getProperty("Password");
	
	return password;
}

public String Dropdown(){
	
	String Dropdown = pro.getProperty("DropDown");
	
	return Dropdown;
}


public String TimeHorizon(){
	
	String TimeHorizon = pro.getProperty("TimeHorizon");
	
	return TimeHorizon;
}

public String MaterialGroup(){
	
	String MaterialGroup = pro.getProperty("MaterialGroup");
	
	return MaterialGroup;
}

public String Table(){
	
	String Table = pro.getProperty("Table");
	
	return Table;
}

public String Shortage(){
	
	String Shortage = pro.getProperty("Shortage");
	
	return Shortage;
}

public String Container(){
	
	String Container = pro.getProperty("Container");
	
	return Container;
}










}
