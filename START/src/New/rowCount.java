package New;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class rowCount {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\c5248056\\Desktop\\Excell.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet1 = wb.getSheet("Sheet1");
		int row = Sheet1.getLastRowNum();
		XSSFCell cell;
		System.out.println(row);
		
		int counter = 0;
		
			for(int i=0;i<row;i++){
				counter++;
				
				
				String Data =Sheet1.getRow(i).getCell(0).getStringCellValue();
				//System.out.println("Data of row"+i+Data);
				
				
				   if(Data.equals("User10")){
				 
					System.out.println(Data+" Is Present in row "+counter);
					
					
					break;
				}	
				
				
				
				
			}
		
		
		
		
		
		
		
		
		
		
		
	}

}
