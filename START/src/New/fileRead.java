package New;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileRead {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\c5248056\\Desktop\\Excell.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet1 = wb.getSheet("Sheet");
		String User = Sheet1.getRow(1).getCell(0).getStringCellValue();
		String Password = Sheet1.getRow(1).getCell(1).getStringCellValue();
		String UserField = Sheet1.getRow(3).getCell(1).getStringCellValue();
		String PswField = Sheet1.getRow(4).getCell(1).getStringCellValue();
		String button = Sheet1.getRow(5).getCell(1).getStringCellValue();
		System.out.println(User);
		System.out.println(Password);
		System.out.println(UserField);
		System.out.println(PswField);	
		System.out.println(button);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
